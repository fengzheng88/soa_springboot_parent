# soa_springboot_parent
当使用feign默认的Contract契约时，以上的代码需要改成如下，才能正确执行

查看FeignTestClient丶FeignConfigure类

参考链接：https://www.cnblogs.com/caoyingjielxq/p/9723570.html


不需要额外的数据库服务器
```md
spring:
  main:
    allow-bean-definition-overriding: true
  jpa:
    generate-ddl: false
    show-sql: true
    hibernate:
      ddl-auto: none
  datasource:
    platform: h2
    schema: classpath:schema.sql
    data: classpath:data.sql
```
