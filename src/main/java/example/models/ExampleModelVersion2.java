package example.models;

import java.math.BigDecimal;

public class ExampleModelVersion2 extends ExampleModelBase {
    private String str;
    private double d;
    private BigDecimal bd;
    private long l;

    public ExampleModelVersion2() {
        this("", 0.0, BigDecimal.ZERO, 0L);
    }

    public ExampleModelVersion2(String str, double d, BigDecimal bd, long l) {
        this.str = str;
        this.d = d;
        this.bd = bd;
        this.l = l;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public BigDecimal getBd() {
        return bd;
    }

    public void setBd(BigDecimal bd) {
        this.bd = bd;
    }

    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }
}
