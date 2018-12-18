##配置文件的加载顺序：
###application.properties 优先级从高到低，application.yml文件优先级也一样级别高的会覆盖级别低的，级别高没有的，级别低有的配置项会同样生效  
  
##1、-- 项目根目录config文件夹里面（优先级最高）  
###./config/  
  
##2、--项目根目录  
###./    
  
##3、-- src/main/resources/config/文件夹里面  
###classpath:/config    
  
##4、-- src/main/resources/  
###classpath:/     
  
##1-4优先级从高到低，优先级高的配置内容会覆盖优先级低的配置内容  
###server.port=8081  

ps:查看配置文件位置.png图片