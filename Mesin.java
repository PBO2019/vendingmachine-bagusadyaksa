public class Mesin {
    private String JenisKopi;
    private String Topping;
    private int JumlahStockKopi;

    //public Mesin (String JenisKopi, String Topping, int JumlahStockKopi){}

    public void setJenisKopi(String jenisKopi) {
        this.JenisKopi = jenisKopi;
    }

    public String getJenisKopi() {
        return JenisKopi;
    }

    public void setJumlahStockKopi(int jumlahStockKopi) {
        this.JumlahStockKopi = jumlahStockKopi;
    }

    public int getJumlahStockKopi() {
        return JumlahStockKopi;
    }

    public void setTopping(String topping) {
        this.Topping = topping;
    }

    public String getTopping() {
        return Topping;
    }
}
