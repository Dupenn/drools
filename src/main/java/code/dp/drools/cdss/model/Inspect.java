package code.dp.drools.cdss.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: Dupeng
 * @Email: dupeng@baiyyy.com.cn
 * @Date: 2020/1/9 12:52
 * @Description:
 */
@Data
@NoArgsConstructor
public class Inspect implements Serializable {
    private String cT;
    private String cN;
    private String cM;
}
