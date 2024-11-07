package org.example;

import com.google.gson.Gson;
import lombok.*;

import javax.print.DocFlavor;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transcation {
    private enum Type{
        VIRINI,
        VIREST,
        VIRMULTA,
        VIRCHAC
    };
    private Type type;
    private String reference;
    private List<Compte>comptes;
    public void typeTransaction(Compte client1, Compte client2) {
        if (client1.getBanque().getId().equals(client2.getBanque().getId())) {
            this.type = type.VIRINI;
        } else if (client1.getBanque().getPays().equals(client2.getBanque().getPays())) {
            this.type = type.VIREST;
        } else if (client1.getBanque().getPays().equals(client2.getBanque().getPays()) && !client1.getBanque().getId().equals(client2.getBanque().getId())) {
            this.type = type.VIRMULTA;
        } else {
            this.type = type.VIRCHAC;
        }

    }
    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);

    }



}
