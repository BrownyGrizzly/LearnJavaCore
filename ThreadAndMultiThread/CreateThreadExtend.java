package ThreadAndMultiThread;

public class CreateThreadExtend extends Thread{
    public CreateThreadExtend(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Hello from CreateThreadExtend " + getName());
    }
}
