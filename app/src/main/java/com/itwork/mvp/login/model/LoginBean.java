package com.itwork.mvp.login.model;

import java.util.List;

public class LoginBean {

    /**
     * res : [{"production":[{"appID":9,"appIcon":"images/94d9eb3536b.png","appLink":"","appName":"3.8报表","typeID":7,"typeName":"生产"},{"appID":10,"appIcon":"images/e23ac7e986a.png","appLink":"","appName":"e-看板","typeID":7,"typeName":"生产"},{"appID":11,"appIcon":"images/28fc461f5ef.png","appLink":"","appName":"领料看板","typeID":7,"typeName":"生产"},{"appID":12,"appIcon":"images/d61c71b1e02.png","appLink":"","appName":"平板看板","typeID":7,"typeName":"生产"},{"appID":13,"appIcon":"images/db9fc798a26.png","appLink":"","appName":"IPQC","typeID":7,"typeName":"生产"},{"appID":14,"appIcon":"images/bafc1b3f118.png","appLink":"","appName":"BLJ","typeID":7,"typeName":"生产"},{"appID":15,"appIcon":"images/cef8c02538b.png","appLink":"","appName":"FQC","typeID":7,"typeName":"生产"},{"appID":16,"appIcon":"images/4c5afc1d6f7.png","appLink":"","appName":"出入库管理","typeID":7,"typeName":"生产"},{"appID":17,"appIcon":"images/e2402b7e6ec.png","appLink":"","appName":"点检","typeID":7,"typeName":"生产"},{"appID":18,"appIcon":"images/d82614ce2dd.png","appLink":"http://10.0.0.22:8004/IPQC/IPQC_index.aspx","appName":"IPQC报数","typeID":7,"typeName":"生产"},{"appID":19,"appIcon":"images/dd0ed285c57.png","appLink":"http://10.0.0.22:8004/ActivationSystem/ActivationTotal.aspx","appName":"稼动率","typeID":7,"typeName":"生产"},{"appID":20,"appIcon":"images/81c09c5ce81.png","appLink":"http://10.0.0.22:8004/ProductReport/ProductReportIndex.aspx","appName":"生产报告","typeID":7,"typeName":"生产"},{"appID":21,"appIcon":"images/43d91290f2b.png","appLink":"http://10.0.0.22:8004/MarkingReport/MarkingReport.aspx","appName":"打标报告","typeID":7,"typeName":"生产"},{"appID":22,"appIcon":"images/666dae00b06.png","appLink":"http://10.0.0.22:8004/ToolCheck/ToolCheck_index.aspx","appName":"刀具管控","typeID":7,"typeName":"生产"},{"appID":23,"appIcon":"images/5fb0042cd48.png","appLink":"http://10.0.0.22:8004/MaPlaManagement/MaPlaIndex.aspx","appName":"机台管理","typeID":7,"typeName":"生产"}],"EAS":[{"appID":38,"appIcon":"images/c0811ab1749.png","appLink":"","appName":"采购订单审批","typeID":8,"typeName":"EAS"},{"appID":39,"appIcon":"images/73f4b73d597.png","appLink":"","appName":"采购申请单审批","typeID":8,"typeName":"EAS"},{"appID":40,"appIcon":"images/3922ecd6e78.png","appLink":"","appName":"委外订单审批","typeID":8,"typeName":"EAS"},{"appID":41,"appIcon":"images/e3db2dce9e5.png","appLink":"","appName":"固定资产验收单","typeID":8,"typeName":"EAS"},{"appID":42,"appIcon":"images/4d5a592150c.png","appLink":"","appName":"固定资产转移审批","typeID":8,"typeName":"EAS"},{"appID":43,"appIcon":"images/b77e8405fab.png","appLink":"","appName":"KR采购订单","typeID":8,"typeName":"EAS"},{"appID":44,"appIcon":"images/4cb3fa8058c.png","appLink":"","appName":"KR采购申请单","typeID":8,"typeName":"EAS"}],"supplier":[{"appID":24,"appIcon":"images/219afa0a435.png","appLink":"http://10.0.0.22:8004/SupplierRating/menu.aspx","appName":"供应商打分","typeID":9,"typeName":"供应商"},{"appID":25,"appIcon":"images/1046800238f.png","appLink":"http://10.0.0.22:8004/sales/sales.aspx","appName":"销售查询","typeID":9,"typeName":"供应商"},{"appID":26,"appIcon":"images/e44b32cc1ff.png","appLink":"http://10.0.0.22:8004/CustomerService/CustomerServiceIndex.aspx","appName":"客服报告","typeID":9,"typeName":"供应商"},{"appID":27,"appIcon":"images/8227ca3ad02.png","appLink":"http://10.0.0.22:8004/mould/Mould_compnay_select.aspx","appName":"模具管理","typeID":9,"typeName":"供应商"},{"appID":28,"appIcon":"images/298bea6a366.png","appLink":"http://10.0.0.22:8004/Supplierdelivery/Login.aspx","appName":"送货管理","typeID":9,"typeName":"供应商"}],"bussinessOnMobile":[{"appID":45,"appIcon":"images/8113cfc611d.png","appLink":"http://192.168.3.66:8019/","appName":"MMS","typeID":10,"typeName":"掌上办公"},{"appID":46,"appIcon":"images/128a8d8c50e.png","appLink":"http://59.37.21.140:8017/SMS/Login/Index","appName":"SMS系统","typeID":10,"typeName":"掌上办公"},{"appID":47,"appIcon":"images/0f0f2915165.png","appLink":"http://59.37.21.140:8013/Main/Main","appName":"电脑盘点","typeID":10,"typeName":"掌上办公"}],"PM":[{"appID":37,"appIcon":"images/197c1fbc81d.png","appLink":"","appName":"PM项目管理","typeID":11,"typeName":"PM"}],"others":[{"appID":29,"appIcon":"images/d5b3203aad3.png","appLink":"http://10.0.0.22:8004/MouldWarehouse/MouldWareIndex.aspx","appName":"模具仓库管理","typeID":12,"typeName":"其他"},{"appID":30,"appIcon":"images/f6674b22576.png","appLink":"http://10.0.0.22:8004/ProjectDocumentation/ProjectIndex.aspx","appName":"项目管理","typeID":12,"typeName":"其他"},{"appID":31,"appIcon":"images/fcdab3912e6.png","appLink":"http://10.0.0.22:8004/CheckServer/Administratorlist.aspx","appName":"服务器检点","typeID":12,"typeName":"其他"},{"appID":32,"appIcon":"images/f41029cf8d4.png","appLink":"http://10.0.0.22:8004/DataCenterMonitor/DataCenterMonitor.aspx","appName":"机房监控","typeID":12,"typeName":"其他"},{"appID":33,"appIcon":"images/3bccf64d002.png","appLink":"http://10.0.0.22:8004/BillingData/BillingData.aspx","appName":"开票资料","typeID":12,"typeName":"其他"},{"appID":34,"appIcon":"images/337dd10942c.png","appLink":"http://10.0.0.22:8004/PowerMonitoring/Administratorlist.aspx","appName":"电力监控","typeID":12,"typeName":"其他"},{"appID":35,"appIcon":"images/b1e55ed1a10.png","appLink":"http://10.0.0.22:8004/PersonnelEntry/Personindex.aspx","appName":"入职培训","typeID":12,"typeName":"其他"},{"appID":36,"appIcon":"images/4b76d7ef103.png","appLink":"http://10.0.0.22:8004/scan.aspx","appName":"二维码扫描","typeID":12,"typeName":"其他"}]}]
     * code : 200
     */

    private int code;
    private List<ResBean> res;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<ResBean> getRes() {
        return res;
    }

    public void setRes(List<ResBean> res) {
        this.res = res;
    }

    public static class ResBean {
        private List<ProductionBean> production;
        private List<EASBean> EAS;
        private List<SupplierBean> supplier;
        private List<BussinessOnMobileBean> bussinessOnMobile;
        private List<PMBean> PM;
        private List<OthersBean> others;

        public List<ProductionBean> getProduction() {
            return production;
        }

        public void setProduction(List<ProductionBean> production) {
            this.production = production;
        }

        public List<EASBean> getEAS() {
            return EAS;
        }

        public void setEAS(List<EASBean> EAS) {
            this.EAS = EAS;
        }

        public List<SupplierBean> getSupplier() {
            return supplier;
        }

        public void setSupplier(List<SupplierBean> supplier) {
            this.supplier = supplier;
        }

        public List<BussinessOnMobileBean> getBussinessOnMobile() {
            return bussinessOnMobile;
        }

        public void setBussinessOnMobile(List<BussinessOnMobileBean> bussinessOnMobile) {
            this.bussinessOnMobile = bussinessOnMobile;
        }

        public List<PMBean> getPM() {
            return PM;
        }

        public void setPM(List<PMBean> PM) {
            this.PM = PM;
        }

        public List<OthersBean> getOthers() {
            return others;
        }

        public void setOthers(List<OthersBean> others) {
            this.others = others;
        }

        public static class ProductionBean {
            /**
             * appID : 9
             * appIcon : images/94d9eb3536b.png
             * appLink :
             * appName : 3.8报表
             * typeID : 7
             * typeName : 生产
             */

            private int appID;
            private String appIcon;
            private String appLink;
            private String appName;
            private int typeID;
            private String typeName;

            public int getAppID() {
                return appID;
            }

            public void setAppID(int appID) {
                this.appID = appID;
            }

            public String getAppIcon() {
                return appIcon;
            }

            public void setAppIcon(String appIcon) {
                this.appIcon = appIcon;
            }

            public String getAppLink() {
                return appLink;
            }

            public void setAppLink(String appLink) {
                this.appLink = appLink;
            }

            public String getAppName() {
                return appName;
            }

            public void setAppName(String appName) {
                this.appName = appName;
            }

            public int getTypeID() {
                return typeID;
            }

            public void setTypeID(int typeID) {
                this.typeID = typeID;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }
        }

        public static class EASBean {
            /**
             * appID : 38
             * appIcon : images/c0811ab1749.png
             * appLink :
             * appName : 采购订单审批
             * typeID : 8
             * typeName : EAS
             */

            private int appID;
            private String appIcon;
            private String appLink;
            private String appName;
            private int typeID;
            private String typeName;

            public int getAppID() {
                return appID;
            }

            public void setAppID(int appID) {
                this.appID = appID;
            }

            public String getAppIcon() {
                return appIcon;
            }

            public void setAppIcon(String appIcon) {
                this.appIcon = appIcon;
            }

            public String getAppLink() {
                return appLink;
            }

            public void setAppLink(String appLink) {
                this.appLink = appLink;
            }

            public String getAppName() {
                return appName;
            }

            public void setAppName(String appName) {
                this.appName = appName;
            }

            public int getTypeID() {
                return typeID;
            }

            public void setTypeID(int typeID) {
                this.typeID = typeID;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }
        }

        public static class SupplierBean {
            /**
             * appID : 24
             * appIcon : images/219afa0a435.png
             * appLink : http://10.0.0.22:8004/SupplierRating/menu.aspx
             * appName : 供应商打分
             * typeID : 9
             * typeName : 供应商
             */

            private int appID;
            private String appIcon;
            private String appLink;
            private String appName;
            private int typeID;
            private String typeName;

            public int getAppID() {
                return appID;
            }

            public void setAppID(int appID) {
                this.appID = appID;
            }

            public String getAppIcon() {
                return appIcon;
            }

            public void setAppIcon(String appIcon) {
                this.appIcon = appIcon;
            }

            public String getAppLink() {
                return appLink;
            }

            public void setAppLink(String appLink) {
                this.appLink = appLink;
            }

            public String getAppName() {
                return appName;
            }

            public void setAppName(String appName) {
                this.appName = appName;
            }

            public int getTypeID() {
                return typeID;
            }

            public void setTypeID(int typeID) {
                this.typeID = typeID;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }
        }

        public static class BussinessOnMobileBean {
            /**
             * appID : 45
             * appIcon : images/8113cfc611d.png
             * appLink : http://192.168.3.66:8019/
             * appName : MMS
             * typeID : 10
             * typeName : 掌上办公
             */

            private int appID;
            private String appIcon;
            private String appLink;
            private String appName;
            private int typeID;
            private String typeName;

            public int getAppID() {
                return appID;
            }

            public void setAppID(int appID) {
                this.appID = appID;
            }

            public String getAppIcon() {
                return appIcon;
            }

            public void setAppIcon(String appIcon) {
                this.appIcon = appIcon;
            }

            public String getAppLink() {
                return appLink;
            }

            public void setAppLink(String appLink) {
                this.appLink = appLink;
            }

            public String getAppName() {
                return appName;
            }

            public void setAppName(String appName) {
                this.appName = appName;
            }

            public int getTypeID() {
                return typeID;
            }

            public void setTypeID(int typeID) {
                this.typeID = typeID;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }
        }

        public static class PMBean {
            /**
             * appID : 37
             * appIcon : images/197c1fbc81d.png
             * appLink :
             * appName : PM项目管理
             * typeID : 11
             * typeName : PM
             */

            private int appID;
            private String appIcon;
            private String appLink;
            private String appName;
            private int typeID;
            private String typeName;

            public int getAppID() {
                return appID;
            }

            public void setAppID(int appID) {
                this.appID = appID;
            }

            public String getAppIcon() {
                return appIcon;
            }

            public void setAppIcon(String appIcon) {
                this.appIcon = appIcon;
            }

            public String getAppLink() {
                return appLink;
            }

            public void setAppLink(String appLink) {
                this.appLink = appLink;
            }

            public String getAppName() {
                return appName;
            }

            public void setAppName(String appName) {
                this.appName = appName;
            }

            public int getTypeID() {
                return typeID;
            }

            public void setTypeID(int typeID) {
                this.typeID = typeID;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }
        }

        public static class OthersBean {
            /**
             * appID : 29
             * appIcon : images/d5b3203aad3.png
             * appLink : http://10.0.0.22:8004/MouldWarehouse/MouldWareIndex.aspx
             * appName : 模具仓库管理
             * typeID : 12
             * typeName : 其他
             */

            private int appID;
            private String appIcon;
            private String appLink;
            private String appName;
            private int typeID;
            private String typeName;

            public int getAppID() {
                return appID;
            }

            public void setAppID(int appID) {
                this.appID = appID;
            }

            public String getAppIcon() {
                return appIcon;
            }

            public void setAppIcon(String appIcon) {
                this.appIcon = appIcon;
            }

            public String getAppLink() {
                return appLink;
            }

            public void setAppLink(String appLink) {
                this.appLink = appLink;
            }

            public String getAppName() {
                return appName;
            }

            public void setAppName(String appName) {
                this.appName = appName;
            }

            public int getTypeID() {
                return typeID;
            }

            public void setTypeID(int typeID) {
                this.typeID = typeID;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }
        }
    }
}
