package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ItemsController01 implements Controller {

    public ModelAndView handleRequest(HttpServletRequest req,
            HttpServletResponse res) throws Exception {
        //����service���� ���ݿ⣬��ѯ��Ʒ�б�����ʹ�þ�̬����ģ��
        List<Items> itemsList = new ArrayList<Items>();
        //��list����侲̬����
        
        Items items_1 = new Items();
        items_1.setName("�ʼǱ�����");
        items_1.setPrice(6000f);
        items_1.setDetail("����ʼǱ�����");
        
        Items items_2 = new Items();
        items_2.setName("ƻ���ֻ�");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone6�ֻ���");
        
        itemsList.add(items_1);
        itemsList.add(items_2);

        //����ModelAndView
        ModelAndView modelAndView =  new ModelAndView();
        //�൱ ��request��setAttribut����jspҳ����ͨ��itemsListȡ����
        modelAndView.addObject("itemsList", itemsList);
        //ָ����ͼ
        modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");

        return modelAndView;
    }

}