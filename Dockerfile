FROM java:8
ADD ["https://github.com/tweakers-dev/MockMock/blob/master/release/MockMock.jar?raw=true", "/mail/"]
WORKDIR /mail/
ENTRYPOINT ["java","-jar","MockMock.jar"]

