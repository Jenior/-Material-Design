package com.example.administrator.part1.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/6/14.
 */
public class EvaluateBean {

    /**
     * code : 1
     * msg : 请求成功
     * items : [{"evaluateData":"这是一个服务评论表12","evaluateGrade":"123.0","evaluateTime":"2016-06-14 15:04:10.0","userImg":"","userName":"2"},{"evaluateData":"这是一个dfwqcv","evaluateGrade":"123.0","evaluateTime":"2016-06-14 15:04:10.0","userImg":"","userName":"2"},{"evaluateData":"这是一个服务评论表1234567","evaluateGrade":"123.0","evaluateTime":"2016-06-14 15:04:10.0","userImg":"","userName":"2"},{"evaluateData":"这是一个服务评论表","evaluateGrade":"123.0","evaluateTime":"2016-06-14 15:04:10.0","userImg":"","userName":"2"},{"evaluateData":"这是一个qcv","evaluateGrade":"123.0","evaluateTime":"2016-06-14 15:04:10.0","userImg":"","userName":"2"},{"evaluateData":"这是一个服务评论表1234567","evaluateGrade":"123.0","evaluateTime":"2016-06-14 15:04:10.0","userImg":"","userName":"2"},{"evaluateData":"这是一个dfwfghgcxbvcndsfaqcv","evaluateGrade":"123.0","evaluateTime":"2016-06-14 15:04:10.0","userImg":"","userName":"2"},{"evaluateData":"这是一个服务评论表1234567qeeradffdcvq","evaluateGrade":"123.0","evaluateTime":"2016-06-14 15:04:10.0","userImg":"","userName":"2"},{"evaluateData":"这是一个服务评论表12345","evaluateGrade":"123.0","evaluateTime":"2016-06-14 15:04:10.0","userImg":"","userName":"2"},{"evaluateData":"这是一个dfwfghgcxbvcqcv","evaluateGrade":"123.0","evaluateTime":"2016-06-14 15:04:10.0","userImg":"","userName":"2"}]
     */

    private String code;
    private String msg;
    /**
     * evaluateData : 这是一个服务评论表12
     * evaluateGrade : 123.0
     * evaluateTime : 2016-06-14 15:04:10.0
     * userImg :
     * userName : 2
     */

    private List<ItemsBean> items;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        private String evaluateData;
        private String evaluateGrade;
        private String evaluateTime;
        private String userImg;
        private String userName;

        public String getEvaluateData() {
            return evaluateData;
        }

        public void setEvaluateData(String evaluateData) {
            this.evaluateData = evaluateData;
        }

        public String getEvaluateGrade() {
            return evaluateGrade;
        }

        public void setEvaluateGrade(String evaluateGrade) {
            this.evaluateGrade = evaluateGrade;
        }

        public String getEvaluateTime() {
            return evaluateTime;
        }

        public void setEvaluateTime(String evaluateTime) {
            this.evaluateTime = evaluateTime;
        }

        public String getUserImg() {
            return userImg;
        }

        public void setUserImg(String userImg) {
            this.userImg = userImg;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }
}
