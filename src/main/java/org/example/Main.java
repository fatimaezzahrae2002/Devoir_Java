package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Compte q = new Compte("jssii768kj",null,null,"dskjsd","sjjskj",new Banque("234","Maroc", null)
        );
        Compte p = new Compte("jssii768kj",null,null,"dskjsd","sjjskj",new Banque("234","Maroc", null)
        );
        Transcation t = new Transcation();
        t.typeTransaction(q,p);
        System.out.println(t.getType());
        p.toJson();
        System.out.println(q.toJson());
        Client c = new Client("jdjjd","jsjjs","jjsjjs","jajak@gmail.com","skjskksks","jsjjsjajja",null);
        System.out.println(c.toJson());

    }
}