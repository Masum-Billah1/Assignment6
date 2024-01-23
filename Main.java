package Assignment6;

public class Main {
    public static void main(String[] args) {
        Webpage basicWebPage = new BasicWebPage("This is a basic webpage", "CSS");
        basicWebPage.display();
        Webpage authorizedwebpage = new AuthorizedWebpage(basicWebPage);
        AuthenticateWebpage a1 = new AuthenticateWebpage(basicWebPage);
        a1.display_authentication();
        Webpage authenticatewebpage = new AuthenticateWebpage(basicWebPage);
        AuthenticateWebpage a2 = new AuthenticateWebpage(basicWebPage);
        a2.display_authentication();
    }
}
