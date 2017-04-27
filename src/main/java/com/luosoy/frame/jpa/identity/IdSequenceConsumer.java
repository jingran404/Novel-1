package com.luosoy.frame.jpa.identity;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface IdSequenceConsumer {

    /**
     * Producer class.
     *
     * @return the class
     */
    Class<?> producerClass();

    /**
     * Param.
     *
     * @return the string
     */
    String param() default "";
}