package proiectul1_etapa1.services;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class audit {

    public void addNewEvent(String functie){
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate= dateFormat.format(date);
        //System.out.println(functie + ',' + formattedDate);
        ArrayList<String[] > events = this.getAuditHistory();
        String[] event = new String[2];
        event[0] = functie;
        event[1] = formattedDate;
        events.add(event);
        this.writeInAudit(events);
    }

    public ArrayList<String[]> getAuditHistory() {
        String csvFile = "/Users/Niga/IdeaProjects/PROIECT_PARTEA1/src/proiectul1_etapa1/audit.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<String[]> auditHistory = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] event = line.split(cvsSplitBy);
                auditHistory.add(event);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    return auditHistory;
    }

    public void writeInAudit(ArrayList<String[]> events) {

        try (PrintWriter writer = new PrintWriter(new File("/Users/Niga/IdeaProjects/PROIECT_PARTEA1/src/proiectul1_etapa1/audit.csv"))) {

            for (String[] event : events){
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(event[0]));
                sb.append(',');
                sb.append(String.valueOf(event[1]));
                sb.append('\n');
                writer.write(sb.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

