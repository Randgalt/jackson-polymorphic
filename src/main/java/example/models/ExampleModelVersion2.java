package example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ExampleModelVersion2 extends ExampleModelBase {
    private String str;
    private double d;
    private BigDecimal bd;
    private long l;
    @JsonProperty("a_really_long_name")
    private long aReallyLongName;

    public ExampleModelVersion2() {
        this("", 0.0, BigDecimal.ZERO, 0L, 0);
    }

    public ExampleModelVersion2(String str, double d, BigDecimal bd, long l, long aReallyLongName) {
        this.str = str;
        this.d = d;
        this.bd = bd;
        this.l = l;
        this.aReallyLongName = aReallyLongName;
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

    public long getAReallyLongName() {
        return aReallyLongName;
    }

    public void setAReallyLongName(long aReallyLongName) {
        this.aReallyLongName = aReallyLongName;
    }
}
