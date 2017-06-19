
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * Copyright 2017 Sairaorg209
 */

/**
 *
 * @author Sairaorg209
 */
public class AllowanceManager {
    private static Frame1 F1;
    private static Frame2 F2;
    private static Frame3 F3;
    private static Frame0 F0;
    
    public static void beginProcess(Frame1 F1,int s){
        
       F1.invokeFirst(F2, F3 ,F0,s);
    }
    public static void main(String args[]){
        F1 = new Frame1();
        F2 = new Frame2();
        F3 = new Frame3();
        F0 = new Frame0();
        int allw=0;
        
        
        try{
            FileReader fr = new FileReader("H:\\Programs in lab\\JavaOOP\\MyAllowanceManager\\Allowance.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String str = null;
            String str1 = null;
            
            while((str = br.readLine())!=null){
            str1=str;
            }
            
            if(str1==null)
                allw=0;
            else{
                StringTokenizer st = new StringTokenizer(str1);
            
                allw = Integer.parseInt(st.nextToken());
                
               
                
                //System.out.println(allw);
                
                //System.out.print(month_expense);
                
            }    
            beginProcess(F1,allw);
            
        }catch(IOException | NumberFormatException e){
            
            e.getMessage();
            
            System.exit(0);
        }

        
        
    }
    
}
