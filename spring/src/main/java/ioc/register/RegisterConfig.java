package ioc.register;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * useDefaultFilters:指includeFilters是否使用默认属性 默认属性为@Component注解范围
 * 当要修改指includeFilters时必须设置为false。仅需修改excludeFilters时必须为false
 * includeFilter内的过滤器为 或者 关系 满足其一即可
 */
@ComponentScan(basePackages="base.module")//基于Component注解方式
@Import({ImportRegistrarInject.class, ClassImportSelector.class})
public class RegisterConfig {


}
