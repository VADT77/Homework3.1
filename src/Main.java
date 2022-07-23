
public class Main {
    public static void main(String[] args) {
        int cost = 10_000;
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

    }
}