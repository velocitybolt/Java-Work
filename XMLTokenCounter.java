package parseXML;
// Author: Murtaza Meerza

import java.util.ArrayList;
import stdlib.*;

public class CountToken {

    public static void main(String[] args) {
        StdOut.print("Enter the file name:");
        String inpfile = StdIn.readLine();
        StdIn.fromFile(inpfile);
        ArrayList<XMLToken> Tokens = new ArrayList<XMLToken>();
        while(!StdIn.isEmpty()){
            String[] tok = StdIn.readString().split(" ");
            for(int i = 0; i < tok.length; i++){
                XMLToken newTok = new XMLToken(tok[i]);
                Tokens.add(newTok);
            }
            

        }
        int OpenTag = 0;
        int CloseTag = 0;
        int Str = 0;
        int MalformToken = 0;

        for(int i=0; i<Tokens.size(); i++){
            if(Tokens.get(i).isTag()){
                if(Tokens.get(i).isOpeningTag()){
                    OpenTag++;
                }else if(Tokens.get(i).isClosingTag()){
                    CloseTag++;
                }else{
                    MalformToken++;
                }
            }else {
                Str++;
            }
        }
         StdOut.println("Number of words in file: " +Str);
         StdOut.println("Number of XML OpenT in file: " +OpenTag);
         StdOut.println("Number of XML CloseT in file: " +CloseTag);
         StdOut.println("Number of XML MalformTok in file: "+MalformToken);
    }
}
