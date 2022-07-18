public class BonusMilesService {

    public int calculate(int cost) {
        int amount = 5 ;
        int result = (cost / amount);
        System.out.println("вам начислено" + result);
        return result;
    }
}
