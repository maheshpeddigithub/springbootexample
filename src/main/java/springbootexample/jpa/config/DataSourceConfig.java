package springbootexample.jpa.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource createDataSource() throws Exception {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setJdbcUrl("jdbc:derby://127.0.0.1:1527/EmployeeDB;create=true;user=sa;password=sa");
        ds.setDriverClass("org.apache.derby.jdbc.ClientDriver");
        return ds;
    }

}
