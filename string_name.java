package string;

public class string_name {
    public static void main(String[] args) {
        // preethi
        // chennai
        string_name o = new string_name();
      //  o.name_print();
       // o.switchcase();
        String name ="kumar";
        String name1 ="Kumar";
        if(name==name1){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }

    private void switchcase() {
        String name = "education";
        int i=0;
        int vowel=0;
        int constant=0;

        while (i<name.length()) {
            switch (name.charAt(i)){
                case 'a':

                case 'E':
                case 'i':
                 case 'o':
                case 'u':vowel++;
                break;
                default:
                    constant++;
                    break;

            }
            i++;
        }
        System.out.println(vowel);
        System.out.println(constant);
    }

    private void name_print() {
        String name ="chennai";
       int j=0;
        for (int i = 0; i < name.length(); i++) {

            if(name.charAt(j)==name.charAt(j+1)) {
                char ch = (char) (name.charAt(i) - 32);
                System.out.print(ch);
                System.out.print(ch);
               i++;
            }

            else {
                    System.out.print(name.charAt(i));
                }
            j++;
            }

        }
    }

