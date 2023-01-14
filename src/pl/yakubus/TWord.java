package pl.yakubus;

public class TWord{
    private String word;

    public TWord(String data) {
        this.word = data;
    }

    public void show(){
        System.out.print(this.word + " ");
    }


    @Override
    public String toString() {
        return "TWord{" +
                "word='" + word + '\'' +
                '}';
    }
}
