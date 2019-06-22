package redistemplate.bean;

import lombok.Data;

/**
 * @author likaixuan email:likaixuan(a)innodev.com.cn
 * @Date: 2019/6/22 17:34
 * @Version 1.0
 */
@Data
public class UserVo {

    public  static final String Table = "t_user";

    private String name;
    private String address;
    private Integer age;

    @Override
    public String toString() {
        return "UserVo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
