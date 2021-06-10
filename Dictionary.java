/*
- Course: CSC340.05 TOE
- Student: Nyan Lin Tun, SFSU ID: 921138254
- Teammate: Kaung Htun, SFSU ID: 921325259
- Assignment Number: 02
- Assignment Due Date & Time: 09-18-2020 at 11:55 PM
* */
import java.util.*;

public class Dictionary {
    static Map<String, ArrayList<DictionaryValues>> dict = new HashMap<String, ArrayList<DictionaryValues>>();
    static ArrayList<DictionaryValues> dValue = new ArrayList<>();
    public static void DataLoading() {

        System.out.println("! Loading data...");

        for (DictionaryValues someEnum : DictionaryValues.values()) {
            String key = someEnum.getKeyword().toUpperCase();
            if (!dict.containsKey(key)) {
                ArrayList<DictionaryValues> VALUES = new ArrayList<>();
                VALUES.add(someEnum);
                dict.put(key, VALUES);
            } else {
                ArrayList<DictionaryValues> VALUES = dict.get(key);
                VALUES.add(someEnum);
                dict.put(key, VALUES);
            }
        }
        System.out.println("! Loading complete...\n");
    }
    public static void print(ArrayList<DictionaryValues> c){
        if(!c.isEmpty()) {
            System.out.println("|");
            for (DictionaryValues a : c) {
                System.out.println(a);
            }
            System.out.println("|");
        }
    }
    public static void pos(ArrayList<DictionaryValues> c,String b) {
        boolean s = true;
        for (int i = 0; i < c.size(); i++) {
            if (!c.get(i).getPartOfSpeech().equalsIgnoreCase(b)) {
                c.remove(c.get(i));
                i--;
            }
            else{
                s = false;
            }
        }
        if (s) {
            notFound();
            help();
        }

    }

    public static void rev(ArrayList<DictionaryValues> a){
        Collections.reverse(a);
    }

    public static void dis(ArrayList<DictionaryValues> a){
        for(int j=0; j < a.size(); j++){
            for (int i=j+1; i<a.size(); i++){
            if(a.get(j).getPartOfSpeech().equalsIgnoreCase(a.get(i).getPartOfSpeech()) &&
                    a.get(j).getDef().equalsIgnoreCase(a.get(i).getDef())){

               a.remove(a.get(i));
               i--;
                }
            }
        }
    }
    public static void help(){
        System.out.println("|\n"+"PARAMETER HOW-TO, please enter:\n"+
                "1. A search key -then 2. An optional part of speech -then\n"+
                "3. An optional 'distinct' -then 4. An optional 'reverse'\n"+"|");
    }

    public static void notFound(){
        System.out.println("|\n"+"<Not Found> To be considered for the next release. Thank you.\n"+"|");
    }

    public static void printError(String e){
        System.out.println("|\n"+"<The entered 2nd parameter '"+ e + "' is NOT a part of speech.>\n" +
                "<The entered 2nd parameter '" + e + "' is NOT 'distinct'.>\n" +
                "<The entered 2nd parameter '" + e + "' is NOT 'reverse'.>\n" +
                "<The entered 2nd parameter '" + e + "' was disregarded.>\n" +
                "<The 2nd parameter should be a part of speech or 'distinct' or 'reverse'.>\n"+"|");
    }
    public static void printSecondError(String e){
        System.out.println("|\n"+
                "<The entered 3rd parameter '" + e + "' is NOT 'distinct'.>\n" +
                "<The entered 3rd parameter '" + e + "' is NOT 'reverse'.>\n" +
                "<The entered 3rd parameter '" + e + "' was disregarded.>\n" +
                "<The 3rd parameter should be 'distinct' or 'reverse'.>\n"+"|");
    }
    public static void printThirdError(String e){
        System.out.println("|\n"+
                "<The entered 4th parameter '" + e + "' is NOT 'reverse'.>\n" +
                "<The entered 4th parameter '" + e + "' was disregarded.>\n" +
                "<The 4th parameter should be 'reverse'.>\n"+"|");
    }

    public static void main(String[] args) {
        System.out.println("\nProgrammed by Kaung Htun and Nyan Tun\n");
        DataLoading();
        Scanner input = new Scanner(System.in);
        int i = 1;
        String word = null;
        boolean search = false;
        System.out.println("===== DICTIONARY 340 JAVA =====\n" + "----- Keywords: 19\n" +
                "----- Definitions: 61\n");
        while(!search){

            boolean compare = false;
            boolean reverse = false;
            boolean distinct = false;
            System.out.print("Search ["+i+"]: ");
            String userinput = input.nextLine();
            ArrayList<String> list = new ArrayList<>(Arrays.asList(userinput.split(" ")));
            ArrayList<DictionaryValues> wList = new ArrayList<>();
            /*System.out.println(list.get(0));
            System.out.println(list.get(1));
            System.out.println(list.get(2));
            System.out.println(list.get(3));*/
            if (dict.containsKey(list.get(0).toUpperCase()) && list.size()<5) {
                word = list.get(0).toUpperCase();
                wList.addAll(dict.get(word));

                if(list.size()>3 && list.get(3)!=null){
                    if(list.get(3).equalsIgnoreCase("REVERSE")){
                        reverse = true;
                        //System.out.println("4th rev");
                    }
                    else{
                        printThirdError(list.get(3));

                    }
                }
                if(list.size()>2 && list.get(2)!=null){
                    if (list.get(2).equalsIgnoreCase("REVERSE")) {
                        //System.out.println("3rd rev");
                        reverse = true;
                    }
                    else if(list.get(2).equalsIgnoreCase("DISTINCT")){
                        distinct = true;
                    }
                    else{
                        printSecondError(list.get(2));
                    }
                }

                if(list.size()>1 && list.get(1)!= null){

                    if(list.get(1).equalsIgnoreCase("REVERSE")){
                        reverse = true;
                    }
                    else if (list.get(1).equalsIgnoreCase("DISTINCT")){
                        distinct = true;

                    }
                    else if(dict.containsKey(list.get(1).toUpperCase()))
                    {
                        compare = true;
                    }
                    else{
                        printError(list.get(1));
                    }
                }
                else if(list.size()>1 && !dict.containsKey(list.get(1).toUpperCase())){
                    System.out.println("Not Found");
                }

            }
            else if(list.get(0).equalsIgnoreCase("!Help")
                    || list.get(0).equalsIgnoreCase("") || list.size()>4){
                help();
            }
            else if (list.get(0).equalsIgnoreCase("!q")){
                System.out.println("-----Thank you-----");
                search = true;

            }
            else{
                notFound();
                help();
            }
            if(reverse){
                //System.out.println("rev");
                rev(wList);
            }
            if(distinct){
                //System.out.println("dis");
                dis(wList);
            }
            if (compare){
                pos(wList, list.get(1));
            }
            print(wList);
            i++;
        }
    }
}
