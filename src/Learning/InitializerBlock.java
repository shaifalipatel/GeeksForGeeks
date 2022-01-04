package Learning;

public class InitializerBlock {

    InitializerBlock(){
        System.out.println("Inside Constructor");
    }
    static {
        System.out.println("Inside InitializerBlock");
    }
    public static void main(String[] args){

        InitializerBlock initializerBlock = new InitializerBlock();
    }
}
