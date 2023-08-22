package com.linkedbear.spring.configuration_17_18$30.b_profile.anno;

import com.linkedbear.spring.configuration_17_18$30.b_profile.component.Boss;
import com.linkedbear.spring.configuration_17_18$30.b_profile.config.BartenderConfiguration;
import com.linkedbear.spring.configuration_17_18$30.b_profile.registrar.WaiterRegistrar;
import com.linkedbear.spring.configuration_17_18$30.b_profile.selector.BarImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class})
public @interface EnableTavern {

}
