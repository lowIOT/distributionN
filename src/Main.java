import java.util.EnumSet;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか、
// ガターで <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {

        // EnumSet<Day> largeTruckSchedule = EnumSet.of(Day.MONDAY, Day.WEDNESDAY, Day.FRIDAY);
        CarAttribute car0 = new HeavyTrucks(1000,"零号機","綾波",1000,10);

        System.out.println("車両情報:");

        car0.standby();
        car0.perfection();
        car0.showInfo();
        car0.load();
        car0.showInfo();
        System.out.println("----------");

        CarAttribute car1 = new LightTrucks(1001,"初号機","碇",800,3);

        car1.standby();
        car1.perfection();
        car1.showInfo();
        car1.inspection();
        car1.showInfo();

        System.out.println("----------");

        CarAttribute car2 = new CourierTrucks(1002,"弐号機","惣流",800,1);

        car2.standby();
        car0.perfection();
        car2.showInfo();

        System.out.println("----------");

        Cargo cargo1 = new CargoInfo("赤城","葛城",10,30,1111,"1800");

        System.out.println("貨物情報:");
        cargo1.showInfo();
        System.out.println("----------");

    }
}