public class Calculator {
    
    public int sum(int a,int b){
        return a+b;
    }

    public int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        
        Calculator cc=new Calculator();
        int result=cc.sum(78, 89);
        cc.sum(78, 65, 56);
        System.out.println(result);
    }
}
