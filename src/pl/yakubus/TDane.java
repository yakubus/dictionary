package pl.yakubus;

import java.util.ArrayList;
import java.util.*;

import java.lang.*;

   public class TDane {
       private ArrayList <String> recenzje;

        TDane() {
            recenzje = new ArrayList<>();
            recenzje.add("Thetwin to horror z wieloma wadami, bardzo powolne tempo sprawia, że miejscami staje się nudny i w ogólnej ocenie wypada mocno średnio. Na plus na pewno piękna praca kamery, zaskakujący twist na końcu oraz podobieństwa do Midsommar 🙂");
            recenzje.add("ShangChi to bardzo świeża i ciekawa historia ze świetnymi scenami walki, zabawnymi i łatwymi do polubienia bohaterami i złoczyńcą, który jest zdecydowanie jednym z najciekawszych w MCU. Pozytywne zaskoczenie po średniej Czarnej wdowie, najlepszy film marvela od lat\"");
        };

        public void add(String data){
            this.recenzje.add(data);
        }

        public String get(){
            if(this.recenzje.isEmpty()){
                System.out.println("brak danych");
                return null;
            }else {
                String tmp = this.recenzje.get(0);
                this.recenzje.remove(0);
                return tmp;
            }
        }

        public boolean isNotEmpty(){
            if (this.recenzje.isEmpty()) return Boolean.FALSE;
            return Boolean.TRUE;
        }
    };




