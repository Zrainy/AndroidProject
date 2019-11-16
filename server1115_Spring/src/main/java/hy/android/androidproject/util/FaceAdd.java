package hy.android.androidproject.util;

import java.util.HashMap;
import java.util.Map;

import com.baidu.aip.util.Base64Util;

/**
 * 人脸注册
 *
 */
public class FaceAdd {
	private static String accessToken = "24.f9e68abe93a0877cd60cc2e66ea52055.2592000.1574589011.282335-17614773";

	public static String add() throws Exception {

		byte[] bytes1 = FileUtil.readFileByBytes("E:\\jar\\mine.jpg");
		String image1 = Base64Util.encode(bytes1);

		// 请求url
		String url = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/user/add";
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("image", image1);
			map.put("group_id", "admin_1");
			map.put("user_id", "huangyan");
			map.put("user_info", "黄艳");
			map.put("liveness_control", "NORMAL");
			//map.put("image_type", "FACE_TOKEN");   
			map.put("image_type", "BASE64");
			map.put("quality_control", "LOW");

			String param = GsonUtils.toJson(map);
			// 客户端可自行缓存，过期后重新获取。
			String result = HttpUtil.post(url, accessToken, "application/json", param);
			System.out.println(result);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws Exception {
		String string = FaceAdd.add();
		System.out.println(string);
	}
}
