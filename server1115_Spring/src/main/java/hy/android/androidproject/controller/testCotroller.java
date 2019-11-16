package hy.android.androidproject.controller;

import com.google.gson.Gson;
import hy.android.androidproject.util.FaceTest;
import hy.android.androidproject.util.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

public class testCotroller {

    @ResponseBody
    @Controller
    public class AndroidCotroller {

        @RequestMapping(value = "/AndroidTest")
        public String upload1(HttpServletRequest request) {
            String images = request.getParameter("images");
            System.out.println(images);
            return "我接受到了呀 。" + images;
        }

    }
}
