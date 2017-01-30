
/**
 * Abstract class Person - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Person
{
   private String name;
   private int age;
   private int contract;
   private boolean gender;
   
   public Person(){
       name = "";
       age = 0;
       contract = 0;
       gender = false;
    }
    
   public Person(int a, String n, boolean g, int c){
      name = n;
      age = a;
      contract = c;
      gender = g;
   }
   
   public String getName(){
       return name;
    }
    
   public int getContract(){
       return contract;
    }

   public boolean getGender(){
       return gender;
    }
    
   public int getAge(){
       return age;
    }
    
   public void setAge(int a){
       age = a;
    }
    
   public void setContract(int c){
       contract = c;
    }
    
   public void setGender(boolean g){
       gender = g;  
    }
    
   public void setName(String n){
       name = n;
    }
   public abstract class info{};
   
}
