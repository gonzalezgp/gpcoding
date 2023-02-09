
/**
 * Write a description of class Contacts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contacts
{
   String fname;
   String lname;
   String phoneNum;
   int id;
   boolean isFamily;
   
   public Contacts(){
       fname="John";
       lname="Smith";
       phoneNum="908-765-4321";
       id=0;
       isFamily=false;
   }
      
   public Contacts(String fname, String lname, String phoneNum, int id, boolean isFamily){
       this.fname=fname;
       this.lname=lname;
       this.phoneNum=phoneNum;
       this.id=id;
       this.isFamily=isFamily;
   }
   
   
   
   public void PrintInfo(){
       System.out.println("First name: "+fname);
       System.out.println("Last name: "+lname);
       System.out.println("Phone Number: "+phoneNum);
       System.out.println("ID: "+id);
       System.out.println("Is the person family?: "+isFamily+"\n");
   }
   
   public static void main(String[] args){
       Contacts person1 = new Contacts();
       person1.PrintInfo();
       
       Contacts person2 = new Contacts("Ayman","Neazi","123-456-6789",1,true);
       person2.PrintInfo();
       
       
       //System.out.println("First name: "+person1.fname);
       //System.out.println("Last name: "+person1.lname);
       //System.out.println("Phone Number: "+person1.phoneNum);
       //System.out.println("ID: "+person1.id);
       //System.out.println("Is the person family?: "+person1.isFamily+"\n");
       
   }
}
