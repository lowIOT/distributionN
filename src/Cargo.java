public abstract class Cargo {

    public String sender;

    public String receiving;

    public double weight;

    public double volume2;

    public double cargonumber;

    public String shippingtime;

    public Cargo(String sender, String receiving, double weight, double volume2, int cargonumber, String shippingtime) {

        this.sender = sender;
        this.receiving = receiving;
        this.weight = weight;
        this.volume2 = volume2;
        this.cargonumber = cargonumber;
        this.shippingtime = shippingtime;
    }

    public void showInfo() {
        System.out.println("発送者:"+this.sender+" 様");
        System.out.println("受取人:"+this.receiving+" 様");
        System.out.println("重量:"+this.weight+" グラム");
        System.out.println("体積:"+this.volume2+" 立方センチメートル");
        System.out.println("貨物番号:"+this.cargonumber);
        System.out.println("発送時刻:"+ shippingtime);
    }
}
