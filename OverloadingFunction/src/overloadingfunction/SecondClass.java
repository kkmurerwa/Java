package overloadingfunction;

public class SecondClass extends OverloadingFunction{
    /*The next method utilises overriding*/
    public void chora(){
        System.out.println("================================================");
    }
    public void ujinga(){
        SecondClass ob = new SecondClass();
        ob.chora();
        System.out.println("I am an inheriting method " +ob.letaArea(25.3));
        ob.chora();
    }
}