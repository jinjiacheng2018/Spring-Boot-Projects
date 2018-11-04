### SpringBoot整合jsp页面步骤：
1.导入对jsp的依赖，最好也导入jstl、servlet-api的依赖
    <dependency>
      <groupId>org.apache.tomcat.embed</groupId>
      <artifactId>tomcat-embed-jasper</artifactId>
      <version>8.5.20</version>
    </dependency>

2.导入tomcat的启动插件
    <plugin>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-maven-plugin</artifactId>
    </plugin>
    
    ps: 2.1.直接启动入口类无法访问jsp页面
        2.2.启动方式：在Maven Projects视图的plugins下通过Spring-boot的spring-boot:rum运行
    
3.配置文件中配置视图的前后缀名
    spring:
      mvc:
        view:
          prefix: /WEB-INF/views/
          suffix: .jsp
          
4.整合完成，访问jsp页面
    http://localhost:8888/spring-boot-test/index.jsp          