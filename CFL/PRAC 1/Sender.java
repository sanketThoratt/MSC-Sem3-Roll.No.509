/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;
import java.net.Socket;

public class Sender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int i=0, k=0;
        String s="";
        String ct="";
        String key="";
        Socket sc = new Socket("localhost", 6017);
        Random r = new Random();
        System.out.println("Enter the String: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
        s = br.readLine();
        int j[] = new int[s.length()];
        for (i=0; i<s.length(); i++){
            j[k] = r.nextInt(50);
            key += Integer.valueOf(j[k])+",";
            System.out.println("j= "+j[k]);
            ct += (char)(s.charAt(i)+j[k]);
            k++;
        }
        System.out.println("Key= "+key);
        System.out.println("Encrypted Msg: " +ct);
        bw.write(ct+","+key);
        bw.flush();
        bw.close();
    }
    
}
