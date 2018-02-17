package hungrytigers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Hello world!
 */

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    /**
     * This is a bean to get a {@link DispatcherServlet} to start dispatching
     *
     * @return a {@link DispatcherServlet} object.
     */
    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

    /**
     * All the servlet mappings are done through this bean.
     *
     * @return a {@link ServletRegistrationBean}
     */
    @Bean
    public ServletRegistrationBean dispatcherServletRegistration() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(dispatcherServlet(), "/vyh/api/*");
        servletRegistrationBean.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
        return servletRegistrationBean;
    }
}
