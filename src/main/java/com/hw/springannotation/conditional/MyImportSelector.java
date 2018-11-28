package com.hw.springannotation.conditional;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description 自定义逻辑返回需要注入的组建
 * @Author hw
 * @Date 2018/11/28 15:52
 * @Version 1.0
 */
public class MyImportSelector implements ImportSelector {
    /**
     * 返回值就是需要导入的组建 全类名
     *
     * @param importingClassMetadata 当前标注@Import注解类的所有注解信息
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {


        // 不能返回null
        return new String[]{"com.hw.springannotation.beans.Blue"};
    }
}
