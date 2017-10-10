package com.barry.elk.service;

import com.alibaba.fastjson.JSON;
import com.barry.elk.base.BaseTest;
import com.barry.elk.vo.business.VehicleInfo;
import org.apache.http.HttpHost;
import org.elasticsearch.Build;
import org.elasticsearch.Version;
import org.elasticsearch.action.DocWriteRequest;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.main.MainResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.cluster.ClusterName;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ES API接口测试
 *
 * @author: hants
 * @create: 2017/10/10 14:52
 * desc:
 */
public class ESQueryServiceTest extends BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(ESQueryServiceTest.class);

    private static final String ip = "192.168.1.50";
    private static final Integer port = 9003;
    private static String index = "driver_service";
    private static String driverType = "driver";
    private static String customerType = "customer";
    private static String idName = "";
    private VehicleInfo vehicleInfo;
    private List<VehicleInfo> list;

    @Before
    public void prepare(){
        //组合数据
        for (int i=1;i<11;i++){
            VehicleInfo vehicle = new VehicleInfo();
            vehicle.setId(String.valueOf(i));
            vehicle.setGroupId("test-groupId"+"-"+String.valueOf(i));
            vehicle.setCusId("test-cusId"+"-"+String.valueOf(i));
            vehicle.setChangPai("test-changPai"+"-"+String.valueOf(i));
            vehicle.setCheXi("test-cheXi"+"-"+String.valueOf(i));
            vehicle.setCheXingDaiMa("test-cheXingDaiMa"+"-"+String.valueOf(i));
            vehicle.setCheJiaHao("test-cheJiaHao"+"-"+String.valueOf(i));
            vehicle.setFaDongJiHao("test-faDongJiHao"+"-"+String.valueOf(i));
            vehicle.setChePaiHao("test-chePaiHao"+"-"+String.valueOf(i));
            vehicle.setChePaiYanSe("test-chePaiYanSe"+"-"+String.valueOf(i));
            vehicle.setBianSuXiangHao("test-bianSuXiangHao"+"-"+String.valueOf(i));
            vehicle.setChanDi("test-chanDi"+"-"+String.valueOf(i));
            vehicle.setGouCheDate(new Date());
            vehicle.setBaoXianDate(new Date());
            vehicle.setZhiZaoDate(new Date());
            vehicle.setNeiShiYanSe("test-neiShiYanSe"+"-"+String.valueOf(i));
            vehicle.setShangJianDanHao("test-shangJianDanHao"+"-"+String.valueOf(i));
            vehicle.setHeGeZhengHao("test-heGeZhengHao"+"-"+String.valueOf(i));
            vehicle.setJinKouZhengHao("test-jinKouZhengHao"+"-"+String.valueOf(i));
            vehicle.setCheLiangGuiGe("test-cheLiangGuiGe"+"-"+String.valueOf(i));
            vehicle.setCheLiangSort("test-cheLiangSort"+"-"+String.valueOf(i));
            vehicle.setNextExaDate(new Date());
            vehicle.setIsZiDianSale("test-isZiDianSale"+"-"+String.valueOf(i));
            vehicle.setSaleName("test-saleName"+"-"+String.valueOf(i));
            vehicle.setSaleBillNo("test-saleBillNo"+"-"+String.valueOf(i));
            list.add(vehicle);
        }
        //单体数据
        vehicleInfo.setId("001");
        vehicleInfo.setGroupId("test-groupId"+"-"+"001");
        vehicleInfo.setCusId("test-cusId"+"-"+"001");
        vehicleInfo.setChangPai("test-changPai"+"-"+"001");
        vehicleInfo.setCheXi("test-cheXi"+"-"+"001");
        vehicleInfo.setCheXingDaiMa("test-cheXingDaiMa"+"-"+"001");
        vehicleInfo.setCheJiaHao("test-cheJiaHao"+"-"+"001");
        vehicleInfo.setFaDongJiHao("test-faDongJiHao"+"-"+"001");
        vehicleInfo.setChePaiHao("test-chePaiHao"+"-"+"001");
        vehicleInfo.setChePaiYanSe("test-chePaiYanSe"+"-"+"001");
        vehicleInfo.setBianSuXiangHao("test-bianSuXiangHao"+"-"+"001");
        vehicleInfo.setChanDi("test-chanDi"+"-"+"001");
        vehicleInfo.setGouCheDate(new Date());
        vehicleInfo.setBaoXianDate(new Date());
        vehicleInfo.setZhiZaoDate(new Date());
        vehicleInfo.setNeiShiYanSe("test-neiShiYanSe"+"-"+"001");
        vehicleInfo.setShangJianDanHao("test-shangJianDanHao"+"-"+"001");
        vehicleInfo.setHeGeZhengHao("test-heGeZhengHao"+"-"+"001");
        vehicleInfo.setJinKouZhengHao("test-jinKouZhengHao"+"-"+"001");
        vehicleInfo.setCheLiangGuiGe("test-cheLiangGuiGe"+"-"+"001");
        vehicleInfo.setCheLiangSort("test-cheLiangSort"+"-"+"001");
        vehicleInfo.setNextExaDate(new Date());
        vehicleInfo.setIsZiDianSale("test-isZiDianSale"+"-"+"001");
        vehicleInfo.setSaleName("test-saleName"+"-"+"001");
        vehicleInfo.setSaleBillNo("test-saleBillNo"+"-"+"001");
    }

    @Test
    public void testSave(){
        try {
            RestClient lowLevelRestClient = RestClient.builder(new HttpHost("192.168.1.50", 9200, "http")).build();
            RestHighLevelClient client = new RestHighLevelClient(lowLevelRestClient);

            BulkRequest bulkRequest = new BulkRequest();
            bulkRequest.add(new IndexRequest(index, driverType, "").source(JSON.toJSON(vehicleInfo), XContentType.JSON));

            IndexRequest request = new IndexRequest(index, driverType, "001")
                    .source(JSON.toJSON(vehicleInfo), XContentType.JSON)
                    .opType(DocWriteRequest.OpType.CREATE);
            IndexResponse response = client.index(request);
            logger.info("======>IndexResponse:"+JSON.toJSONString(response));
        } catch (IOException e) {
            logger.error("testSave error {} ", e);
        }
    }

    @Test
    public void testSelect(){
        try {
            RestClient lowLevelRestClient = RestClient.builder(new HttpHost("192.168.1.50", 9200, "http")).build();
            RestHighLevelClient client = new RestHighLevelClient(lowLevelRestClient);

            String index = "springboot";
            String type = "springboot";
            String id = "AV7Mnhrbvm1IeJsqdGbp";
            GetRequest getRequest = new GetRequest(index, type, id);
            GetResponse getResponse = client.get(getRequest);
            logger.info("==============>"+ JSON.toJSONString(getRequest));
        } catch (IOException e) {
            logger.error("testSelect error {} ", e);
        }
    }

    @Test
    public void testInfoApi(){
        try {
            RestClient lowLevelRestClient = RestClient.builder(new HttpHost("192.168.1.50", 9200, "http")).build();
            RestHighLevelClient client = new RestHighLevelClient(lowLevelRestClient);
            MainResponse response = client.info();
            logger.info("============>response:"+JSON.toJSONString(response));
            ClusterName clusterName = response.getClusterName();
            logger.info("============>clusterName:"+JSON.toJSONString(clusterName));
            String clusterUuid = response.getClusterUuid();
            logger.info("============>clusterUuid:"+clusterUuid);
            String nodeName = response.getNodeName();
            logger.info("============>nodeName:"+nodeName);
            Version version = response.getVersion();
            logger.info("============>version:"+JSON.toJSONString(version));
            Build build = response.getBuild();
            logger.info("============>build:"+JSON.toJSONString(build));
        } catch (IOException e) {
            logger.error("testInfoApi error {} ", e);
        }
    }

}