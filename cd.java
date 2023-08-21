class Calender{
    int a;
    public int add(int n1,int n2){
        return n1+n2;
    }
        public int sub(int n1,int n2){
            return n1-n2;
        }
    
}

public class cd {
    public static void main(String[] args) {
        Calender cal = new Calender();
        int result1=cal.add(4,5);
        int result2=cal.sub(3, 2);
        System.out.println(result1);
        System.out.println(result2);


        }
}
