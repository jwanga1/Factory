public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>TestButton</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World'");
    }
}
