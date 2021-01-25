package base;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * metadataReader 当前类的信息
 */
public class CustomFilter implements TypeFilter {
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        System.out.println("-------"+metadataReader.getClassMetadata().getClassName());
        if(metadataReader.getClassMetadata().getClassName().endsWith("test")){
            return true;
        }
        return false;
    }
}
