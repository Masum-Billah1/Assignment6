package Assignment6;

public class AuthorizedWebpage extends WebpageDecorator{
    WebpageDecorator data;
    public AuthorizedWebpage(Webpage decorator){
        super(decorator);
    }
    @Override
    public void display() {
        super.display();
    }
    public void checking_authorization(){
        System.out.println("Chequing user authorization....");
        System.out.println("User is authorized\n");
    }
}
