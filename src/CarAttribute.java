// 各トラックの属性
public abstract class CarAttribute implements Operation, Maintenance {
    public int carnumber;

    public String carname;

    public String driver;

    public int stock;

    public int volume;

    TruckStatus status;

    TrackMaintenance maintenance;


    public CarAttribute(int carnumber, String carname, String driver, int stock, int volume) {
        this.carnumber = carnumber;
        this.carname = carname;
        this.driver = driver;
        this.stock = stock;
        this.volume = volume;
    }

        public void showInfo() {
        System.out.println("車両ステータス:"+this.status);
        System.out.println("車両の保守状況:"+this.maintenance);
        System.out.println("車両番号:"+this.carnumber);
        System.out.println("車両名:"+this.carname);
        System.out.println("運転者:"+this.driver);
        System.out.println("積載量:"+this.stock+"キログラム");
        System.out.println("容積:"+this.volume+"立方メートル");
    }
}
