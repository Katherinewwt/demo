# 使用JDK 17作为基础镜像
FROM openjdk:17-jdk-slim

# 设置工作目录
WORKDIR /app

# 复制项目JAR包到容器中
COPY target/*.jar app.jar

# 设置环境变量
ENV SERVER_PORT=8083

# 暴露端口
EXPOSE 8083

# 启动命令
ENTRYPOINT ["java","-jar","app.jar","--server.port=8083"]