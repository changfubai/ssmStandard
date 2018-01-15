package com.xiaobai.ssm.controller;

import com.xiaobai.ssm.common.exception.MyException;
import com.xiaobai.ssm.pojo.Items;
import com.xiaobai.ssm.service.items.ItemsService;
import com.xiaobai.ssm.service.user.UserService;
import com.xiaobai.ssm.util.Tools;
import com.xiaobai.ssm.util.logger.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ItemsControl extends BaseContoller{
    @Autowired
    protected ItemsService itemsService;

    @RequestMapping("/itemsList")
    public String queryList(Model model) throws Exception{
        List<Items> itemsList = itemsService.selectAll();
        //if (true) {
        //    throw new MyException("自定义异常出现了~");
        //}
        LogUtil.info("md5加密:" + Tools.getMD5("md5加密"));
        model.addAttribute("itemList", itemsList);
        LogUtil.info(itemsList.get(0).toString());
        return "itemList";
    }


}
