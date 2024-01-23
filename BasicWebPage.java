package Assignment6;

public class BasicWebPage implements Webpage {
    private String content;
    private String Stylesheet="CSS";
    public BasicWebPage(String content, String Stylesheet){
        this.content = content;
        this.Stylesheet = Stylesheet;
    }
    @Override
    public void display() {
        System.out.println("Displaying Basic Webpage: "+content);
        System.out.println("The followed Stylesheet for this webpage: "+Stylesheet+"\n");
    }
}
