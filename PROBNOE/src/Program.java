package PROBNOE.src;

import java.io.*;

public class Program {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("file.txt", false))
        {

            String text = "987-123-4567";
            writer.write(text);
            writer.append('\n');
            writer.append("123 456 7890");
            writer.append('\n');
            writer.append("(123) 456-7890");
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileReader reader = new FileReader("file.txt"))
        {
            int c;
            StringBuilder s = new StringBuilder("");
            while((c=reader.read())!=-1){
                s.append((char)c);
            }
            String[] a = s.toString().split("\n");
            StringBuilder builder = new StringBuilder("");
            for (String value : a) {
                String[] b = value.split("");

                if (b[3].equals("-") && b[7].equals("-") && b.length == 12) {
                    builder.append(value);
                    builder.append('\n');
                } else if (b[0].equals("(") && b[4].equals(")") && b[5].equals(" ") && b[9].equals("-") && b.length == 14) {
                    builder.append(value);
                    builder.append('\n');
                }
            }
            System.out.println(builder);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
}