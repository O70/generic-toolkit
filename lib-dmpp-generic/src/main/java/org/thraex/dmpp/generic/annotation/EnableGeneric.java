package org.thraex.dmpp.generic.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.thraex.dmpp.generic.GenericConfigurationImportSelector;
import org.thraex.dmpp.generic.GenericConfigurationRegistrar;
import org.thraex.dmpp.generic.GenericHandlerRegistrar;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 鬼王
 * @date 2022/04/14 21:49
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import({ GenericConfigurationImportSelector.class, GenericHandlerRegistrar.class })
@Import({ GenericConfigurationRegistrar.class, GenericHandlerRegistrar.class })
@Configuration
public @interface EnableGeneric {
}
