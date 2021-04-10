public class HangingMan {

    private int numWrongGuesses;
    String[] HangmanImage = {"+----+\n"+
                                "|\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",

                                "+----+\n"+
                                "|    O\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",
                            
                                "+----+\n"+
                                "|    O\n"+
                                "|    +\n"+
                                "|\n"+
                                "/\\\n",
                            
                                "+----+\n"+
                                "|    O\n"+
                                "|    +-\n"+
                                "|\n"+
                                "/\\\n",
                                
                                
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|\n"+
                                "/\\\n",
                                
                                
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \n"+
                                "/\\\n",
                                
                                
                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \\\n"+
                                "/\\\n",
                            };
                            
                            
                           public HangingMan(){
                               this.numWrongGuesses=0;
                               
                               
                               
                            }
                            
                            
                            public boolean isntDead(){
                                
                                
                             if(this.numWrongGuesses>=6){
                             return false;
                            }
                              else {
                             
                             return true; 
                             
                             
                            }
                             
                            }
                            
                            public void show(){
                                
                                
                                System.out.println(HangmanImage[this.numWrongGuesses]);
                                
                                
                                
                            }
                            
                            public void dieSomeMore(){
                                
                                this.numWrongGuesses++;
                                
                                System.out.println(this.numWrongGuesses);
                                
                            }
}
