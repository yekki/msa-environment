## Docker模式
### 进入每个模块，执行如下命令部署相应服务
    mvn clean
    mvn package -Dmaven.test.skip=true
    mvn dockerfile:build
    mvn exec:exec

## 刷新测试
    curl -v -X POST "http://192.168.50.139:8781/actuator/bus-refresh"