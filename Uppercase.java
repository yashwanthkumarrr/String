package string;

public class Uppercase {
    public static void main(String[] args) {
        Uppercase obj = new Uppercase();
      //  obj.upper("thariq");
        // obj.upper_();

    }

    private void upper_() {
        String name = "thariq1234";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

//System.out.print
            //(ch);
            if (ch >= 'a' && ch <= 'z') {
                if (i % 2 == 0)
                    System.out.print((char) (ch - 32));
                else
                    System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
    }

   /* private void upper(String name) {
       // name = name.toUpperCase();
//		System.out.println(name);
        for(int i=0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            System.out.print((char)(ch-32));
        }
    }*/
}
