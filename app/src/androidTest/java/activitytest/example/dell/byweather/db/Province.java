package activitytest.example.dell.byweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by dell on 2017/7/31.
 */

public class Province extends DataSupport{
    private int id;

    private String province;

    private int  provinceCode;

    public int getId() {
        return id;
    }

    public String getProvince() {
        return province;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
