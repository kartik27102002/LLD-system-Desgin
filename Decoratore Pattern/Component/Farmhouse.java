package Component;

public class Farmhouse implements Pizza{
    @Override
    public int getPrice() {
        return 100;
    }


    public String getDescription()
    {
        return "Farmhouse";
    }
}
