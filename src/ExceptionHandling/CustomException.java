package ExceptionHandling;

public class CustomException {

    public static void main(String[] args){
        int a = 10;
        int b = 0;
        //Normal handling exception
        try{
            if(a/b!=0)
                System.out.println("no exception");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args, int value) throws Exception {
        int a = 10;
        int b = 0;
        //Throwing an exception --> base class throwable --> object
        try {
            if(a/b!=0)
                System.out.println("no exception");
        } catch(Exception e){
            throw new Exception("divide by zero");
        }
    }

}
