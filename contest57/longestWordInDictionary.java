package contest57;

import java.util.ArrayList;
import java.util.LinkedList;

public class longestWordInDictionary {
    public static void main(String[] args) {
        new longestWordInDictionary().run();
    }
    public void run(){
        String[] words={"d","dr","dm","drm","drq","dmm","dmq","drms","drmm","drqs","drqm","dmms","dmmm","dmqs","dmqm","drmsc","drmsy","drmmc","drmmy","drqsc","drqsy","drqmc","drqmy","dmmsc","dmmsy","dmmmc","dmmmy","dmqsc","dmqsy","dmqmc","dmqmy","drmscs","drmscq","drmsys","drmsyq","drmmcs","drmmcq","drmmys","drmmyq","drqscs","drqscq","drqsys","drqsyq","drqmcs","drqmcq","drqmys","drqmyq","dmmscs","dmmscq","dmmsys","dmmsyq","dmmmcs","dmmmcq","dmmmys","dmmmyq","dmqscs","dmqscq","dmqsys","dmqsyq","dmqmcs","dmqmcq","dmqmys","dmqmyq","drmscsv","drmscsx","drmscqv","drmscqx","drmsysv","drmsysx","drmsyqv","drmsyqx","drmmcsv","drmmcsx","drmmcqv","drmmcqx","drmmysv","drmmysx","drmmyqv","drmmyqx","drqscsv","drqscsx","drqscqv","drqscqx","drqsysv","drqsysx","drqsyqv","drqsyqx","drqmcsv","drqmcsx","drqmcqv","drqmcqx","drqmysv","drqmysx","drqmyqv","drqmyqx","dmmscsv","dmmscsx","dmmscqv","dmmscqx","dmmsysv","dmmsysx","dmmsyqv","dmmsyqx","dmmmcsv","dmmmcsx","dmmmcqv","dmmmcqx","dmmmysv","dmmmysx","dmmmyqv","dmmmyqx","dmqscsv","dmqscsx","dmqscqv","dmqscqx","dmqsysv","dmqsysx","dmqsyqv","dmqsyqx","dmqmcsv","dmqmcsx","dmqmcqv","dmqmcqx","dmqmysv","dmqmysx","dmqmyqv","dmqmyqx","drmscsvn","drmscsvw","drmscsxn","drmscsxw","drmscqvn","drmscqvw","drmscqxn","drmscqxw","drmsysvn","drmsysvw","drmsysxn","drmsysxw","drmsyqvn","drmsyqvw","drmsyqxn","drmsyqxw","drmmcsvn","drmmcsvw","drmmcsxn","drmmcsxw","drmmcqvn","drmmcqvw","drmmcqxn","drmmcqxw","drmmysvn","drmmysvw","drmmysxn","drmmysxw","drmmyqvn","drmmyqvw","drmmyqxn","drmmyqxw","drqscsvn","drqscsvw","drqscsxn","drqscsxw","drqscqvn","drqscqvw","drqscqxn","drqscqxw","drqsysvn","drqsysvw","drqsysxn","drqsysxw","drqsyqvn","drqsyqvw","drqsyqxn","drqsyqxw","drqmcsvn","drqmcsvw","drqmcsxn","drqmcsxw","drqmcqvn","drqmcqvw","drqmcqxn","drqmcqxw","drqmysvn","drqmysvw","drqmysxn","drqmysxw","drqmyqvn","drqmyqvw","drqmyqxn","drqmyqxw","dmmscsvn","dmmscsvw","dmmscsxn","dmmscsxw","dmmscqvn","dmmscqvw","dmmscqxn","dmmscqxw","dmmsysvn","dmmsysvw","dmmsysxn","dmmsysxw","dmmsyqvn","dmmsyqvw","dmmsyqxn","dmmsyqxw","dmmmcsvn","dmmmcsvw","dmmmcsxn","dmmmcsxw","dmmmcqvn","dmmmcqvw","dmmmcqxn","dmmmcqxw","dmmmysvn","dmmmysvw","dmmmysxn","dmmmysxw","dmmmyqvn","dmmmyqvw","dmmmyqxn","dmmmyqxw","dmqscsvn","dmqscsvw","dmqscsxn","dmqscsxw","dmqscqvn","dmqscqvw","dmqscqxn","dmqscqxw","dmqsysvn","dmqsysvw","dmqsysxn","dmqsysxw","dmqsyqvn","dmqsyqvw","dmqsyqxn","dmqsyqxw","dmqmcsvn","dmqmcsvw","dmqmcsxn","dmqmcsxw","dmqmcqvn","dmqmcqvw","dmqmcqxn","dmqmcqxw","dmqmysvn","dmqmysvw","dmqmysxn","dmqmysxw","dmqmyqvn","dmqmyqvw","dmqmyqxn","dmqmyqxw","drmscsvnt","drmscsvny","drmscsvwt","drmscsvwy","drmscsxnt","drmscsxny","drmscsxwt","drmscsxwy","drmscqvnt","drmscqvny","drmscqvwt","drmscqvwy","drmscqxnt","drmscqxny","drmscqxwt","drmscqxwy","drmsysvnt","drmsysvny","drmsysvwt","drmsysvwy","drmsysxnt","drmsysxny","drmsysxwt","drmsysxwy","drmsyqvnt","drmsyqvny","drmsyqvwt","drmsyqvwy","drmsyqxnt","drmsyqxny","drmsyqxwt","drmsyqxwy","drmmcsvnt","drmmcsvny","drmmcsvwt","drmmcsvwy","drmmcsxnt","drmmcsxny","drmmcsxwt","drmmcsxwy","drmmcqvnt","drmmcqvny","drmmcqvwt","drmmcqvwy","drmmcqxnt","drmmcqxny","drmmcqxwt","drmmcqxwy","drmmysvnt","drmmysvny","drmmysvwt","drmmysvwy","drmmysxnt","drmmysxny","drmmysxwt","drmmysxwy","drmmyqvnt","drmmyqvny","drmmyqvwt","drmmyqvwy","drmmyqxnt","drmmyqxny","drmmyqxwt","drmmyqxwy","drqscsvnt","drqscsvny","drqscsvwt","drqscsvwy","drqscsxnt","drqscsxny","drqscsxwt","drqscsxwy","drqscqvnt","drqscqvny","drqscqvwt","drqscqvwy","drqscqxnt","drqscqxny","drqscqxwt","drqscqxwy","drqsysvnt","drqsysvny","drqsysvwt","drqsysvwy","drqsysxnt","drqsysxny","drqsysxwt","drqsysxwy","drqsyqvnt","drqsyqvny","drqsyqvwt","drqsyqvwy","drqsyqxnt","drqsyqxny","drqsyqxwt","drqsyqxwy","drqmcsvnt","drqmcsvny","drqmcsvwt","drqmcsvwy","drqmcsxnt","drqmcsxny","drqmcsxwt","drqmcsxwy","drqmcqvnt","drqmcqvny","drqmcqvwt","drqmcqvwy","drqmcqxnt","drqmcqxny","drqmcqxwt","drqmcqxwy","drqmysvnt","drqmysvny","drqmysvwt","drqmysvwy","drqmysxnt","drqmysxny","drqmysxwt","drqmysxwy","drqmyqvnt","drqmyqvny","drqmyqvwt","drqmyqvwy","drqmyqxnt","drqmyqxny","drqmyqxwt","drqmyqxwy","dmmscsvnt","dmmscsvny","dmmscsvwt","dmmscsvwy","dmmscsxnt","dmmscsxny","dmmscsxwt","dmmscsxwy","dmmscqvnt","dmmscqvny","dmmscqvwt","dmmscqvwy","dmmscqxnt","dmmscqxny","dmmscqxwt","dmmscqxwy","dmmsysvnt","dmmsysvny","dmmsysvwt","dmmsysvwy","dmmsysxnt","dmmsysxny","dmmsysxwt","dmmsysxwy","dmmsyqvnt","dmmsyqvny","dmmsyqvwt","dmmsyqvwy","dmmsyqxnt","dmmsyqxny","dmmsyqxwt","dmmsyqxwy","dmmmcsvnt","dmmmcsvny","dmmmcsvwt","dmmmcsvwy","dmmmcsxnt","dmmmcsxny","dmmmcsxwt","dmmmcsxwy","dmmmcqvnt","dmmmcqvny","dmmmcqvwt","dmmmcqvwy","dmmmcqxnt","dmmmcqxny","dmmmcqxwt","dmmmcqxwy","dmmmysvnt","dmmmysvny","dmmmysvwt","dmmmysvwy","dmmmysxnt","dmmmysxny","dmmmysxwt","dmmmysxwy","dmmmyqvnt","dmmmyqvny","dmmmyqvwt","dmmmyqvwy","dmmmyqxnt","dmmmyqxny","dmmmyqxwt","dmmmyqxwy","dmqscsvnt","dmqscsvny","dmqscsvwt","dmqscsvwy","dmqscsxnt","dmqscsxny","dmqscsxwt","dmqscsxwy","dmqscqvnt","dmqscqvny","dmqscqvwt","dmqscqvwy","dmqscqxnt","dmqscqxny","dmqscqxwt","dmqscqxwy","dmqsysvnt","dmqsysvny","dmqsysvwt","dmqsysvwy","dmqsysxnt","dmqsysxny","dmqsysxwt","dmqsysxwy","dmqsyqvnt","dmqsyqvny","dmqsyqvwt","dmqsyqvwy","dmqsyqxnt","dmqsyqxny","dmqsyqxwt","dmqsyqxwy","dmqmcsvnt","dmqmcsvny","dmqmcsvwt","dmqmcsvwy","dmqmcsxnt","dmqmcsxny","dmqmcsxwt","dmqmcsxwy","dmqmcqvnt","dmqmcqvny","dmqmcqvwt","dmqmcqvwy","dmqmcqxnt","dmqmcqxny","dmqmcqxwt","dmqmcqxwy","dmqmysvnt","dmqmysvny","dmqmysvwt","dmqmysvwy","dmqmysxnt","dmqmysxny","dmqmysxwt","dmqmysxwy","dmqmyqvnt","dmqmyqvny","dmqmyqvwt","dmqmyqvwy","dmqmyqxnt","dmqmyqxny","dmqmyqxwt","dmqmyqxwy"};
        System.out.println(longestWord(words));
    }
    public String longestWord(String[] words) {
        ArrayList<String> word=new ArrayList<>();
        for (String s:words){
            boolean judge=true;
            for (int i = 1; i <s.length(); i++) {
                if (!find(s.substring(0,i),words)){
                    judge=false;
                    break;
                }
            }
            if (judge){
                word.add(s);
            }
        }
        LinkedList<Integer> indexes=new LinkedList<>();
        int max=0;
        if (word.size()==0){
            return "";
        }else {
            for (int i = 0; i < word.size(); i++) {
                if (word.get(i).length() > max) {
                    max = word.get(i).length();
                    indexes.clear();
                    indexes.add(i);
                } else if (word.get(i).length() == max) {
                    indexes.add(i);
                }
            }
            if (indexes.size() == 1) {
                return word.get(indexes.getFirst());
            } else {
                int index = 0;
                ArrayList<String> sameLengthWords=new ArrayList<>();
                for (int i:indexes){
                    sameLengthWords.add(word.get(i));
                }
                for (int i = 1; i < sameLengthWords.size(); i++) {
                    for (int j = 0; j < sameLengthWords.get(index).length(); j++) {
                        if (sameLengthWords.get(index).charAt(j) != sameLengthWords.get(i).charAt(j)) {
                            if (sameLengthWords.get(index).charAt(j) > sameLengthWords.get(i).charAt(j)) {
                                index = i;
                            }
                            break;
                        }
                    }
                }
                return sameLengthWords.get(index);
            }
        }
    }

    public boolean find(String str,String[] words){
        for (String s:words){
            if (s.equals(str)){
                return true;
            }
        }
        return false;
    }
}
