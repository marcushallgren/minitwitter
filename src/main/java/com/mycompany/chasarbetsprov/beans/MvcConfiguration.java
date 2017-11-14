package com.mycompany.chasarbetsprov.beans;

import com.mycompany.chasarbetsprov.dao.FollowingDao;
import com.mycompany.chasarbetsprov.dao.FollowingDaoImpl;
import com.mycompany.chasarbetsprov.dao.TweetDao;
import com.mycompany.chasarbetsprov.dao.TweetDaoImpl;
import com.mycompany.chasarbetsprov.dao.UserDao;
import com.mycompany.chasarbetsprov.dao.UserDaoImpl;
import com.mycompany.chasarbetsprov.servletutils.RequestHandler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * MvcConfiguration was initially created to declare the "DataSource" for the
 * DAO's in the project All controller's extend this method, so that they can
 * easily access the DAO's and the "RequestHandler"
 *
 * @see com.mycompany.chasarbetsprov.servletutils.RequestHandler
 */
@Configuration
@ComponentScan(basePackages = "com.minitwitter")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {

    public RequestHandler getRequestHandler(HttpServletRequest request, HttpServletResponse response) {
        return new RequestHandler(request, response);
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/minitwitter");
        dataSource.setUsername("root");
        dataSource.setPassword("skolan123");
        return dataSource;
    }

    @Bean
    public UserDao getUserDao() {
        return new UserDaoImpl(getDataSource());
    }

    @Bean
    public TweetDao getTweetsDao() {
        return new TweetDaoImpl(getDataSource());
    }

    @Bean
    public FollowingDao getFollowingDao() {
        return new FollowingDaoImpl(getDataSource());
    }
}
