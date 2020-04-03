# Tema aleasa
    Proiectul un joc unde esti un zeu si oferi din viata ta sa creezi "playeri" care se duc in misiune. 
    Povestea ta este afisata pe ecran pas cu pas si la final aflii daca ai supravetuit ca si zeu si poti continua sa domini lumea. 
    Daca "playerul" tau a supravetuit misiunii, vei castiga 10HP, insa daca a murit vei pierde 20Hp. 
    Pornesti cu 80HP si obectivul este sa ramai cu un numar pozitiv de puncte de viata la final.

# O lista cu 10 actiuni/interogari care se realizeaza in interiorul sistemului este:
      - public void calculateMyRating() - calculeaza in interiorul clasei Gun.java  ratingul armei.
      - public void calculateMyBattleChances() - calculeaza pentru fiecare criteriu sansele de a scapa cu viata dintr-o situatie
      - public void showTheSceneAndStats() - se afla in cadrul clasei de serviciu si in creaza practic povestea pas cu pas
      - public void showMyPlayers() - afiseaza playerii
      - public int genereateWhatHappend(int type, Player player) - primeste Plyerul si tipul de misiune si calculeaza daca a scapat cu viata sau nu din misiune
      - public void buyMyGun() - imita deschidere unei cutii random ce atribuie date armei in functie de noroc
      - public void buyMelee() - asemanatoare functie de mai sus doar ca se ocupa de melees
      - public void showWhatWeaponsIHad() - afiseaza armele si informatiile despre ele
      - public double yourLuckyNumber(double min, double max) - funcite (ce este rescrisa si sa returneze un int) ce imi returneaza un numar in fuctie de nevoile mele pentru a crea scenarii aleatoare
      - public void buyPlayerType(int type) - imi cumpara un player in funcite de scenariu sa am sanse mai mari de castig
      
      
# Obiecte am de tipul:
      - 3 melees
      - 3 arme
      - 3 tipuri de playeri
      - un scenariu
      ...
