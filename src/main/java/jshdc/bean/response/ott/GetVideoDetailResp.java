package jshdc.bean.response.ott;

import jshdc.bean.Video;

/**
 * 获取视频详情
 * Created by yinghuihong on 16/1/11.
 */
public class GetVideoDetailResp {

    public int result;
    public String message;
    public Data data;

    public class Data {
        public Video video;

        @Override
        public String toString() {
            return "Data{" +
                    "video=" + video +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "GetVideoDetailResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
