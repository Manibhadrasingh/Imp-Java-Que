enum Status{
   Running,failed,pending,success;
}

public class EnumClass{
    public static void main(String[] args) {
        // Status s = Status.Running;
        // System.out.println(s);
        Status[] s = Status.values();
        for(Status ss : s){
            System.out.println(ss+" : "+ ss.ordinal());
        }
    }
}