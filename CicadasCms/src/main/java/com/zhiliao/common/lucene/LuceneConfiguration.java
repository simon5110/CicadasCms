package com.zhiliao.common.lucene;

import com.zhiliao.common.utils.PathUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;

/**
 * Description:s
 *
 * @author Jin
 * @create 2017-05-18
 **/
@Configuration
public class LuceneConfiguration {


    @Bean
    public LuceneDao luceneUtil() throws IOException {
        LuceneDao luceneDao = new LuceneDao();
        luceneDao.setIndexDer(PathUtil.getWebRootPath()+ File.separator+"lucene");
        return luceneDao;
    }

}