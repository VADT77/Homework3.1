
public class Main {
    public static void main(String[] args) {
        int cost = 100;
        BonusMilesService service = new BonusMilesService();
        int price = 100;
        int miles = service.calculate(price);
        System.out.println(miles);

    }
}