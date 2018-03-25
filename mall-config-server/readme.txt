配置文件服务器
spring.cloud.config.server.git.uri：配置git仓库地址
spring.cloud.config.server.git.searchPaths：配置仓库路径
spring.cloud.config.label：配置仓库的分支
spring.cloud.config.server.git.username：访问git仓库的用户名
spring.cloud.config.server.git.password：访问git仓库的用户密码

http请求地址和资源文件映射如下:

/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties



#eureka.client.serviceUrl.defaultZone=http://192.168.199.184:6064/eureka/

spring.application.name=config-server
server.port=8761

#https://github.com/forezp/SpringcloudConfig/
#spring.cloud.config.server.git.uri=https://github.com/oilqw/mall/
spring.cloud.config.server.git.uri=https://github.com/forezp/SpringcloudConfig/
spring.cloud.config.server.git.searchPaths=respo
spring.cloud.config.label=master
#spring.cloud.config.server.git.clone-on-start=true
#management.security.enabled=false
#spring.cloud.config.server.git.username=oilqw
#spring.cloud.config.server.git.password=Pass1234