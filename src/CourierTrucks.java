// 宅配車の情報
public class CourierTrucks extends CarAttribute {

    private static final int MAX_LOAD_CAPACITY = 1000;
    private static final int MAX_VOLUME_CAPACITY = 1;

    public CourierTrucks(int carnumber, String carname, String driver, int stock, int volume) {
        super(carnumber, carname, driver, stock, volume);
    }

    @Override
    public void standby() {
        super.status = TruckStatus.STANDBY;
    }

    @Override
    public void load() {
        super.status = TruckStatus.LOADING;
    }

    @Override
    public void transport() {
        super.status = TruckStatus.TRANSPORT;
    }

    @Override
    public void unload() {
        super.status = TruckStatus.UNLOAD;
    }

    public void perfection() {
        super.maintenance = TrackMaintenance.PERFECTION;
    }
    @Override
    public void inspection() {
        super.maintenance = TrackMaintenance.INSPECTION;
    }

    @Override
    public void repair() {
        super.maintenance = TrackMaintenance.REPAIR;
    }

    @Override
    public void exchange() {
        super.maintenance = TrackMaintenance.EXCHANGE;
    }

    @Override
    public void cleaning() {
        super.maintenance = TrackMaintenance.CLEANING;
    }
}
