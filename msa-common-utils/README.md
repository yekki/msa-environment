## 生成证书
    keytool -genkeypair -alias mytestkey -keyalg RSA -dname "CN=config, OU=SC, O=Oracle, L=Shanghai, S=Shanghai,C=CN" -keypass password -keystore server.jks -storepass password