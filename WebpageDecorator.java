package Assignment6;

public abstract class WebpageDecorator implements Webpage{
    protected Webpage decoratorpage;

    public WebpageDecorator(Webpage decoratorwebpage){
        this.decoratorpage = decoratorwebpage;
    }
    public void display(){
        this.decoratorpage.display();
    }
}
