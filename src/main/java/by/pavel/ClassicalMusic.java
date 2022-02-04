package by.pavel;

public class ClassicalMusic implements  Music {
   public  static ClassicalMusic getClassicalMusic(){
       return new ClassicalMusic();
   }
    @Override
    public String getSong() {
        return " classical music";
    }
    public  void  inMethod (){
        System.out.println("in method");
    }
    public  void  detrMethod () {
        System.out.println("detr method");
    }

    }
