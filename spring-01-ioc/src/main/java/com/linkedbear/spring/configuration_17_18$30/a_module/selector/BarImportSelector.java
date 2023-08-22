package com.linkedbear.spring.configuration_17_18$30.a_module.selector;

import com.linkedbear.spring.configuration_17_18$30.a_module.component.Bar;
import com.linkedbear.spring.configuration_17_18$30.a_module.config.BarConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {Bar.class.getName(), BarConfiguration.class.getName()};
    }
}
