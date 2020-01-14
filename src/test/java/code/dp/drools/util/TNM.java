package code.dp.drools.util;

/**
 * @Author: Dupeng
 * @Email: dupeng@baiyyy.com.cn
 * @Date: 2020/1/14 14:47
 * @Description:
 */
public class TNM {
    String cT;
    String cN;
    String m;

    public TNM() {
    }

    public TNM(String cT, String cN, String m) {
        this.cT = cT;
        this.cN = cN;
        this.m = m;
    }

    public String getcT() {
        return cT;
    }

    public void setcT(String cT) {
        this.cT = cT;
    }

    public String getcN() {
        return cN;
    }

    public void setcN(String cN) {
        this.cN = cN;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }
}
