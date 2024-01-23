package Assignment6;

public class AuthenticateWebpage extends WebpageDecorator{
    protected AuthenticateWebpage(Webpage decorator){
        super(decorator);
    }
    @Override
    public void display() {
        super.display();
    }
    public void display_authentication(){
        System.out.println("Checking the authorization of webpage....");
        System.out.println("The webpage is authorized.\n");
    }
}
