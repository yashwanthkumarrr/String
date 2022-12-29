package string;

public class String_pratices {
    public static void main(String[] args) {
        String_pratices o= new String_pratices();
      //  o.upperT0lower();
       // o.trim();
       // o.stripTrailing();
       // o.contain();
       // o.compareTo();
       // o.adjacent_letters_same();
       // o.letter_same_fAndl();
        o.vanakkam_chennai();
    }

    private void vanakkam_chennai() {
        String name="Vanakkam Chennai Tamilnadu";
        // Chennai Vanakkam;
        String box1 ="";
        String box2 ="";
        for (int i = 0; i < name.length(); i++) {

            if(name.charAt(i)!=' '){
                box1=box1+name.charAt(i);
            }
            else {
                box2=box1+" "+box2;
                box1="";
            }
        }
        System.out.println(box1+" "+box2);

    }

    private void letter_same_fAndl() {
        String[] names ={"karthick","pradeep","kumar","thariq"};
        for (int i = 0; i < names.length; i++) {
            String name=names[i];
            if(name.charAt(0)==name.charAt(name.length()-1)){
                System.out.println(name);
            }
        }
    }

    private void adjacent_letters_same() {
        String names[] ={"deepthi","vicky","prithee","kumar"};
        for (int i = 0; i < names.length; i++) {
            String name=names[i];
            for (int j = 0; j <name.length()-1 ; j++) {
                if(name.charAt(j)==name.charAt(j+1)){
                    System.out.println(name);
                    break;
                }

            }

        }
    }

    private void compareTo() {
//        String s1="vicky";
//        String s2 ="dhi";
//        System.out.println(s2.compareTo(s1));
        String [] name={"vicky","dhivya","karthick"};
        for (int i = 0; i < name.length-1; i++) {
          //  String names=name[i];
            String temp="";
            for (int j = i+1; j < name.length ; j++) {
                int result = name[i].compareTo(name[j]);
                if (result<0){
                    temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }

        }
        for (int i = 0; i <name.length ; i++) {
            System.out.println(name[i]);
        }
    }

    private void contain() {
        String name ="Hi this is kumar";
        String s="is";
        boolean ch = true;
     //   System.out.println(name.contains(s));//true
       // System.out.println(s.contains(name)); // false
        int i=0,j=0;
        while (j<name.length()){
            if(s.charAt(i)==name.charAt(j)){
                i++;
                j++;
                if (s.charAt(i)==name.charAt(j)){
                    ch=false;
                    System.out.println("true");
                    break;

                }
                else {
                    i=0;
                    j++;
                }
            }
            else {
                j++;
            }
        }
        if(ch==true){
            System.out.println(false);
        }

    }

    private void stripTrailing() {
        String name="hello hi guy        ";
        boolean ch = true;
        int j=0;
        for (int i = name.length()-1; i >=0; i--) {
            if(name.charAt(i)==' '&& ch==true){

            }
            else {
                ch=false;
                System.out.print(name.charAt(j));
                j++;
            }

        }

    }

    private void trim() {
        String name ="     Hello hi guy    ";
//        System.out.println(name.stripTrailing());
//        System.out.println(name.stripLeading());
//        System.out.println(name.trim());
        boolean ch =true;
        for (int i = 0; i < name.length(); i++) {


            if(name.charAt(i)==' '&& ch==true){

            }else
            {
                ch=false;
                System.out.print(name.charAt(i));
            }

        }
    }

    private void upperT0lower() {
        String name = "YasHwanTh";
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)>='A'&& name.charAt(i)<='Z'){
                System.out.print((char) (name.charAt(i)+32));
            }
            else
                System.out.print((char) (name.charAt(i)-32));
        }
    }
}
