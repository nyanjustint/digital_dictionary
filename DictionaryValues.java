import java.util.*;
/*
- Course: CSC340.05 TOE
- Student: Nyan Lin Tun, SFSU ID: 921138254
- Teammate: Kaung Htun, SFSU ID: 921325259
- Assignment Number: 02
- Assignment Due Date & Time: 09-18-2020 at 11:55 PM
* */

public enum DictionaryValues {

    ARROW("Arrow","noun", "Here is one arrow: <IMG> -=>> </IMG> "),
    BOOKNOUN("Book", "noun", "A set of pages."),
    BOOKNOUN1("Book", "noun", "A written work published in printed or electronic form."),
    BOOKVERB("Book", "verb", "To arrange for someone to have a seat on a plane."),
    BOOKVERB1("Book", "verb","To arrange something on a particular date."),
    DISTINCTADJECTIVE("Distinct","adjective", "Familiar. Worked in Java."),
    DISTINCTADJECTIVE1("Distinct", "adjective",
            "Unique. No duplicates. Clearly different or of a different kind"),
    DISTINCTADVERB("Distinct", "adverb", "Uniquely. Written \'distinctly\'."),
    DISTINCTNOUN("Distinct", "noun", "A keyword in this assignment."),
    DISTINCTNOUN1("Distinct", "noun", "A keyword in this assignment."),
    DISTINCTNOUN2("Distinct", "noun", "A keyword in this assignment."),
    DISTINCTNOUN3("Distinct", "noun", "An advanced search option."),
    DISTINCTNOUN4("Distinct", "noun", "Distinct is a parameter in this assignment."),
    PLACEHOLDERADJECTIVE("Placeholder", "adjective", "To be updated..."),
    PLACEHOLDERADJECTIVE1("Placeholder", "adjective", "To be updated..."),
    PLACEHOLDERADVERB("Placeholder", "adverb", "To be updated..."),
    PLACEHOLDERCONJUNCTION("Placeholder", "conjunction", "To be updated..."),
    PLACEHOLDERINTERJECTION("Placeholder", "interjection", "To be updated..."),
    PLACEHOLDERNOUN("Placeholder", "noun", "To be updated..."),
    PLACEHOLDERNOUN1("Placeholder", "noun", "To be updated..."),
    PLACEHOLDERNOUN2("Placeholder", "noun", "To be updated..."),
    PLACEHOLDERPREPOSITION("Placeholder", "preposition", "To be updated..."),
    PLACEHOLDERPRONOUN("Placeholder", "pronoun", "To be updated..."),
    PLACEHOLDERVERB("Placeholder", "verb", "To be updated..."),
    REVERSEADJECTIVE("Reverse", "adjective", "On back side."),
    REVERSEADJECTIVE1("Reverse", "adjective", "Opposite to usual or previous arrangement."),
    REVERSENOUN("Reverse", "noun", "A dictionary program's parameter."),
    REVERSENOUN1("Reverse", "noun", "Change to opposite direction."),
    REVERSENOUN2("Reverse", "noun", "The opposite."),
    REVERSENOUN3("Reverse", "noun", "To be updated..."),
    REVERSENOUN4("Reverse", "noun", "To be updated..."),
    REVERSENOUN5("Reverse", "noun", "To be updated..."),
    REVERSENOUN6("Reverse", "noun", "To be updated..."),
    REVERSEVERB("Reverse","verb","Change something to opposite"),
    REVERSEVERB1("Reverse","verb","Go back"),
    REVERSEVERB2("Reverse","verb","Revoke ruling"),
    REVERSEVERB3("Reverse","verb","To be updated..."),
    REVERSEVERB4("Reverse","verb","To be updated..."),
    REVERSEVERB5("Reverse","verb","Turn something inside out"),
    NOUN("Noun", "noun","noun"),
    VERB("Verb","verb","verb"),
    ADJECTIVE("Adjective","adjective","adjective"),
    ADVERB("Adverb","adverb","adverb"),
    CONJUNCTION("Conjunction","conjunction","conjunction"),
    INTERJECTION("Interjection","interjection","interjection"),
    PRONOUN("Pronoun","pronoun","pronoun"),
    PREPOSITION("Preposition", "preposition","preposition")

    ;

    //create variables
    private final String generalNote = "Dictionary";
    private String keyword;
    private String partOfSpeech;
    private String def;

    //constructor
    DictionaryValues(String keyword, String partOfSpeech, String def) {
        this.keyword = keyword;
        this.partOfSpeech = partOfSpeech;
        this.def = def;
    }

    //get variables
    public String getKeyword(){ return keyword; }
    public String getPartOfSpeech(){
        return partOfSpeech;
    }
    public String getDef(){
        return def;
    }

    //set variables
    public void setKeyword(String keyword){
        this.keyword = keyword;
    }
    public void setPartOfSpeech(String partOfSpeech){
        this.partOfSpeech = partOfSpeech;
    }
    public void setDef(String def){
        this.def = def;
    }

    @Override
    public String toString(){
        return this.keyword + " ["+this.partOfSpeech+"] : " + this.def;
    }



    //debug to check the enum data

    //public static void main(String[] args) {

    /*Map<String, ArrayList<DictionaryValues>> dict = new HashMap<String, ArrayList<DictionaryValues>>();
        for (DictionaryValues someEnum : DictionaryValues.values()) {
                String key = someEnum.getKeyword().toUpperCase();
                System.out.println(key);
                if (!dict.containsKey(key)){
                    ArrayList<DictionaryValues> VALUES = new ArrayList<>();
                    VALUES.add(someEnum);
                    dict.put(key, VALUES);
                }
                else{
                    ArrayList<DictionaryValues> VALUES = dict.get(key);
                    VALUES.add(someEnum);
                    dict.put(key, VALUES);
                }
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter:");
        String userinput = input.nextLine();
        if(dict.containsKey(userinput.toUpperCase())){
            for(DictionaryValues a:dict.get(userinput.toUpperCase())){
                System.out.println(a);
            }
        }*/

}


