# springboot_elk
springboot集成logstash,logstash连接elasticsearch,kibana展示
1.目前已经集成实现的是springboot elasticsearch
<1>.版本信息: 
elasticsearch 5.6,下载地址: https://www.elastic.co/downloads/elasticsearch;
springboot 1.5.6.RELEASE   
<2>.MAVEN依赖：
    <dependency>
            <groupId>org.elasticsearch.client</groupId>
            <artifactId>elasticsearch-rest-high-level-client</artifactId>
            <version>5.6.2</version>
     </dependency>
 <3>.Java REST Client [5.6] » Java High Level REST Client » Supported APIs
     https://www.elastic.co/guide/en/elasticsearch/client/java-rest/current/java-rest-high-supported-apis.html
 <4>.ES client实现以及增删改查，分页排序功能 
     com.barry.elk.service.ESQueryServiceTest
     
     
