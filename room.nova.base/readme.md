# 说明

启动类

- App 是springboot方式启动类。直接用此类右键run java可以启动，可以使用mvn或者java -jar的方式
- WebApp 是兼容tomcat容器的springboot启动方式。可以mvn打war包后丢到tomcat的webapp下面，启动tomcat即可。此类可以和App的springboot启动方式代码共存。
- WebInitializer是springmvc纯代码的启动方式。此方式启动不需要web.xml，直接用类来代替配置web.xml和springmvc的效果。使用此方式时，建议把springboot相关的启动类关闭，避免干扰。
