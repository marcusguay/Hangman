import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
   // private boolean ready;
    private String Puzzle;
    private ArrayList <String> words= new ArrayList<String>();
    private ArrayList <String> theWord= new ArrayList<String>();
    private ArrayList <String> Censored= new ArrayList<String>();
   public Puzzle() {
        

        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String tempWord = scanner.next().toUpperCase();
                words.add(tempWord);
            }
            scanner.close();
			
			//ONCE THIS LINE OF CODE IS REACHED, YOUR words ArrayList
			//CONTAINS ALL THE WORDS IN words.txt
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
       //this.ready=false;
        this.Puzzle=this.getRandom();
        System.out.println(this.Puzzle);
        this.theWord=this.intoArray(this.Puzzle);
       this.createCensored(this.theWord);
    }
    
    
    public String getRandom(){
        
        
       int t= (int)(Math.random() * (0+words.size()));
       return this.words.get(t);
    }
    
    public void createCensored(ArrayList<String> j){
        
        for(int i=0; i < j.size(); i++){
            
            this.Censored.add("_"); 
            
            
        }
        
       // this.ready=true;
    }
    
    
    public void checkCensored(String j){
         j=j.toUpperCase();
        for(int i=0; i < this.Censored.size(); i++){
            
            if(j.equals(this.theWord.get(i))){
               
            this.Censored.remove(i);
            this.Censored.add(i,j);
            
        }
        
      
    }
}
    
    
    
    public boolean makeGuess(String s){
       s=s.toUpperCase();
      // System.out.println(this.theWord);
       //System.out.println(this.Censored);
        for(int i=0; i < this.theWord.size(); i++){
            //if(ready==true){
            if(s.equals(this.theWord.get(i))){
                
             this.checkCensored(s);   
            return true;
      }
            
  // }
        
}
        
        
        
        
        
        
        return false;
    }
    
    public void show(){
        
        
        
        
        System.out.println("Puzzle :" + this.Censored);
        
        
        
        
        
    }
    
    public ArrayList intoArray(String s){
        ArrayList <String> nice = new ArrayList<String>();
       
        
        
      for(int i=0; i < s.length(); i++){
            
            
            nice.add(s.substring(i,i+1));
            
            
        }
        
        System.out.println(nice);
        return nice;
    }
    
   public boolean isUnsolved(){
       
       int j=0;
     for(int i=0; i < this.theWord.size(); i++){
         
         
         if(this.theWord.get(i).equals(this.Censored.get(i))){
              
             j++;
             
            }
      
       //System.out.println(this.theWord.get(i));
         //     System.out.println(this.Censored.get(i));
        }
     //  System.out.println(j);
       
       if(j==(theWord.size())){
        
       return false;
    }
    else { return true;}
       
    }
    
    public String getWord(){
        
        
        
        
        
        
     return this.Puzzle;   
        
        
    }
}
