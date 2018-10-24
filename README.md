## Quick Start
### 进入每个模块，执行如下命令部署相应服务
    mvn clean
    mvn package -Dmaven.test.skip=true
    mvn dockerfile:build
    mvn exec:exec