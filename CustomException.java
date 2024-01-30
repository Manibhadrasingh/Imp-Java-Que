class ManiException extends Exception{
    public ManiException(String str){
        super(str);
    }
}



public class CustomException {
    public static void main(String[] args) throws ManiException {
        int i =18;
        int j = 0;

        try{
            j = i/0;
            if(j == 0) 
                throw new ManiException("I don't want this output :");
        }
        catch(ManiException m){
            System.out.println("ManiException occured :"+m);
        }
        System.out.println("Everythings fine :");
    }
}
