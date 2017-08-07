
0. pull github 最新代码
1. 复制两个页面 so.html 成 so1.html ， so-order.html  成 so-order1.html

2. 在so1.html 和 so-order1.html 页面上改动

这两个页面的如果调用如下接口则更改为:
1） /s/saveSo  -> /s/saveSo1
2) /s/findSo  -> /s/findSo1
3) /s/getSoList -> /s/getSoList1
4) /s/findCoOrderNosByCompanyCoId  -> /s/findCoOrderNosByCompanyCoId1
5) /s/findCoOrderNosByCompany2Id -> /s/findCoOrderNosByCompany2Id1
6) /s/getSoListByCompanyCoIdAndOrderNo -> /s/getSoListByCompanyCoIdAndOrderNo1
7) /s/getSoListByCompany2IdAndOrderNo ->/s/getSoListByCompany2IdAndOrderNo_1
8) /s/getSoListByCompany2IdAndOrderNo1 -> /s/getSoListByCompany2IdAndOrderNo11
9) /s/getSoListObjs ->/s/getSoListObjs1
10) /s/findOpenedSoList ->/s/findOpenedSoList1
11) /s/findOpenedSoListByQ -> /s/findOpenedSoListByQ1
12) /s/getMaterialDeliveredBySoId -> /s/getMaterialDeliveredBySoId1
13) /s/getMaterialBySoId ->/s/getMaterialBySoId1
14) /check/ssoCode ->/check/ssoCode1
15) /s/saveSSoAutoRemark -> /s/saveSSoAutoRemark1

3. /s/saveSo1  和 /s/findSo1 调用获得数据结构发生变化： 结构和采购订单的结构相似

父级字段：

     soNum; //销售订单ID
     codeSo; //订单编码
     codeCo; //客户订单号
     freightTermId; //货运条件
     paymentTermId; //付款条件
     companyCoId; //客户ID
     statusId;  //状态
     totalAmount //总价
     taxRate //税率
     exchange //汇率
     Long valid;
     String msg;

子级字段：
     materialId  //物料Id
     uprice     //单价
     qtySo      //数量
     totalAmount   //价格
     deliveryDate  //交货日期
     remark       //备注

4. push 代码





