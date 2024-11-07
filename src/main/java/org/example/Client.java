package org.example;

import com.google.gson.Gson;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private String NumClient;
    private String Nom;
    private String Prenom;
    private String Email;
    private String adresse;
    private String phone;
    private List<Compte>compte;
    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);

    }

}
