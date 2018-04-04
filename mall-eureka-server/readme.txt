eureka-server
注册中心配置
端口号7061

服务器端配置：
eureka:
  server:
    # 测试时关闭自我保护机制，保证不可用服务及时踢出
    enable-self-preservation: false
    
客户配置：
# 心跳检测检测与续约时间
# 测试时将值设置设置小些，保证服务关闭后注册中心能及时踢出服务
eureka:
  instance:
    lease-renewal-interval-in-seconds: 1
    lease-expiration-duration-in-seconds: 2