import java.util.UUID;

public class GenerateUUID {
  static String s2="";
  public static final void main(String... args){
    UUID idOne = UUID.randomUUID();
    String s1=idOne.toString();
    s2=s1.substring(0,6);
    log("Patient id : " +s2 );
    
  }
  
  private static void log(Object object){
    System.out.println( String.valueOf(object) );
  }
} 