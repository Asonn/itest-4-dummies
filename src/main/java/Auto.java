public class Auto {

    private String merk;
    private String type;


    public Auto(String merk) {
        this.merk = merk;
    }

    public String getMerkEnType() {
        return this.merk + " " + this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
