package cn.jyd.flux;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by Administrator on 2018/9/7.
 */

@NoArgsConstructor
@Data
public class Test {
    /**
     * id : 0
     * title_hello : aaa
     * children : [{"id":9,"title_hello":"QA测试12","children":null},{"id":21,"title_hello":"鱿鱼","children":null}]
     */
    public static void main(String[] args) {
        Test test = new Test();
        test.setId(231);

    }
    private int id;
    private String titleHello;
    private List<ChildrenBean> children;

    @NoArgsConstructor
    @Data
    public static class ChildrenBean {
        /**
         * id : 9
         * title_hello : QA测试12
         * children : null
         */

        private int id;
        private String titleHello;
        private Object children;
    }
}
