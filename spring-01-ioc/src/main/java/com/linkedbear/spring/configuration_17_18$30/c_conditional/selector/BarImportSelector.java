package com.linkedbear.spring.configuration_17_18$30.c_conditional.selector;

import com.linkedbear.spring.configuration_17_18$30.c_conditional.component.Bar;
import com.linkedbear.spring.configuration_17_18$30.c_conditional.config.BarConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {Bar.class.getName(), BarConfiguration.class.getName()};
    }
}
