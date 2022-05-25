package fr.formation.configuration;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;


@Configuration
@PropertySource("classpath:datasource.properties")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "fr.formation.repository", entityManagerFactoryRef = "emf")
@ComponentScan({"fr.formation.controller", "fr.formation.service"})
public class ApplicationConfiguration {


    @Autowired
    private Environment env;

    /**
     * Construction de la fonction de connexion a la base de données
     * @return
     */
    @Bean
    public DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(env.getProperty("driver"));
        ds.setUrl(env.getProperty("url"));
        ds.setUsername(env.getProperty("user"));
        ds.setPassword(env.getProperty("pass"));


        return ds;
    }


    /**
     * Construction de la fonction de création de l'EntityManagerFactory
     * @return
     */
    @Bean(name = "emf")
    public LocalContainerEntityManagerFactoryBean getEmfb(){

        LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();

        emfb.setPackagesToScan("fr.formation.model");
        emfb.setDataSource(getDataSource());

        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setShowSql(false);
        adapter.setDatabase(Database.MYSQL);

        emfb.setJpaVendorAdapter(adapter);

        Properties props = new Properties();
        props.setProperty("hibernate.hbm2ddl.auto", "create");
        props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");

        emfb.setJpaProperties(props);


        return emfb;
    }


    @Bean(name = "transactionManager")
    public JpaTransactionManager getTransactionManager() {
       JpaTransactionManager tm = new JpaTransactionManager();
       tm.setEntityManagerFactory(getEmfb().getObject());

       return tm;
    }



}
