package pl.yakubus;

class TMain {
    public static void main (String[] args) {

        TDane tDane = new TDane();
        TDictionary tDictionary = new TDictionary();

        String[] tmp = tDane.get().split(" ");
        for(String s: tmp){
            tDictionary.addWord(new TWord(s));
        }

        tDictionary.Stan();

    }
}
