package hy.android.androidproject.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.baidu.aip.util.Base64Util;
import com.google.gson.Gson;

public class FaceTest {

	    public String search(String image) {
	        // 请求url
	        String url = "https://aip.baidubce.com/rest/2.0/face/v3/search";

			//String image1 = Base64Util.encode(bytes1);
			
			//System.out.println("image: " + image);
	        
	        try {
	            Map<String, Object> map = new HashMap<>();
	            //map.put("image", "027d8308a2ec665acb1bdf63e513bcb9");
	            map.put("image", image);
	            map.put("liveness_control", "NONE");
	            map.put("group_id_list", "admin_1");
	            //map.put("image_type", "FACE_TOKEN");
	            map.put("image_type", "BASE64");
	            map.put("quality_control", "LOW");

	            String param = GsonUtils.toJson(map);

	            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
	            String accessToken = "24.f9e68abe93a0877cd60cc2e66ea52055.2592000.1574589011.282335-17614773";

	            String result = HttpUtil.post(url, accessToken, "application/json", param);
	            System.out.println(result);
	            return result;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
}
