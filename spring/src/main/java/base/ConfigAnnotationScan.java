package base;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * useDefaultFilters:指includeFilters是否使用默认属性 默认属性为@Component注解范围
 * 当要修改指includeFilters时必须设置为false。仅需修改excludeFilters时必须为false
 * includeFilter内的过滤器为 或者 关系 满足其一即可
 */
@ComponentScan(basePackages="base.module",
        includeFilters={@ComponentScan.Filter(type = FilterType.CUSTOM,classes = CustomFilter.class)
        ,@ComponentScan.Filter(Controller.class)},
        useDefaultFilters=false)
public class ConfigAnnotationScan {
}
