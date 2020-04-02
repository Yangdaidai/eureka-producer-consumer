## **spring cloud：服务提供与调用**
 ###  -  **eureka**
 ###  -  **turbine**
 ###  -  **hystrix**
 ###  -  **hystrix**
 ###  -  **spring boot admin**
   -  依次启动spring-cloud-eureka、spring-cloud-producer、spring-cloud-consumer三个项目
  
   -  先输入：http://localhost:9000/hello?name=neo 检查spring-cloud-producer服务是否正常
  
   -  返回：hello neo，this is first message
  
   - 说明spring-cloud-producer正常启动，提供的服务也正常。
  
   -  浏览器中输入：http://localhost:9001/hello/neo
  
   - 返回：hello neo，this is first message
  
   - 说明客户端已经成功的通过feign调用了远程服务hello，并且将结果返回到了浏览器。
