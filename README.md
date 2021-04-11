# docdocker2104
1）更新base_api数据结构

2） 增加微服务客户端测试类，同时简化客户端，去除Ribbon负载均衡和Eureka客户端

3） host配置：

127.0.0.1	eureka-10001.com

127.0.0.1	eureka-10002.com

127.0.0.1	eureka-10003.com

127.0.0.1	paramcase-21201.com

127.0.0.1	paramcase-21301.com 

127.0.0.1	paramcase-21401.com 

127.0.0.1	client.com

4)服务端

http://paramcase-21201.com:21201/case/list

5）测试端

http://client.com:666/consumer/case/list
