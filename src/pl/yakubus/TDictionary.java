package pl.yakubus;

import java.util.HashSet;

public class TDictionary {
        TDictionary() { 
            noDictionaries++;
            this.word_list = new HashSet<TWord>();
        } 
        TDictionary(HashSet<TWord> arg) {
            noDictionaries++;
            this.word_list = new HashSet<TWord>();
            for(TWord el: arg)
                this.addWord(el);
        } 
        public void Stan() { 
            for(TWord el: this.word_list)
                el.show();
        } 
        public void addWord(TWord el) { 
            this.word_list.add(el);
        } 
        public HashSet<TWord> getWord_list(){ 
            return word_list;
        } 
        private HashSet<TWord> word_list;
        public static int noDictionaries = 0;
    }

