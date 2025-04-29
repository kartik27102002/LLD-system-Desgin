package Component;

public class Margherita implements Pizza {
    @Override
    public int getPrice() {
        return 100;
    }


    public String getDescription()
    {
        return "Margherita";
    }
}
