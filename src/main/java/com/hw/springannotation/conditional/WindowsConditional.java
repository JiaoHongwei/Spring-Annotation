package com.hw.springannotation.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/11/28 15:02
 * @Version 1.0
 */
public class WindowsConditional implements Condition {
    /**
     * Determine if the condition matches.
     *
     * @param context  判断条件使用的上下文环境
     * @param metadata 当前标注了该注解的注释信息
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // TODO: 2018/11/28 是否是Windows操作系统
        Environment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        if (property.contains("Windows")) {
            return true;
        }
        return false;
    }
}
