package org.example;

import com.google.gson.Gson;
import lombok.*;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Compte {
    private String NumCompte;
    private Date dateCreation;
    private Date dateUpdate;
    private String Devise;
    private String NumClient;
    private Banque banque;
    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);

    }





}
