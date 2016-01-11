package jshdc.bean.response.ott;

import java.util.List;
import jshdc.bean.Content;

/**
 * Created by yinghuihong on 16/1/11.
 */
public class SearchResp {
  public int result;
  public String message;
  public Data data;

  public class Data {
    public List<Content> contents;

    @Override public String toString() {
      return "Data{" +
          "contents=" + contents +
          '}';
    }
  }

  @Override public String toString() {
    return "SearchResp{" +
        "result=" + result +
        ", message='" + message + '\'' +
        '}';
  }
}
