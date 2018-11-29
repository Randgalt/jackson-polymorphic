package example.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.math.BigDecimal;

public class ExampleModelVersion1 extends ExampleModelBase {
    private String str;
    private int i;
    private BigDecimal bd;

    public ExampleModelVersion1() {
        this("", 0, BigDecimal.ZERO);
    }

    public ExampleModelVersion1(String str, int i, BigDecimal bd) {
        this.str = str;
        this.i = i;
        this.bd = bd;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public BigDecimal getBd() {
        return bd;
    }

    public void setBd(BigDecimal bd) {
        this.bd = bd;
    }
}
