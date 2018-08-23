package cn.bdqn.billprovider.controller;


import cn.bdqn.billprovider.service.Ebook_EntryServcie;
import cn.bdqn.pojo.Ebook_Entry;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ebook_EntryController {
    @Autowired
    private Ebook_EntryServcie ebook_entryServcie;

    @RequestMapping("selInfo/{categoryId}")
    public String selInfo(@PathVariable(value = "categoryId") Integer categoryId){
        return JSON.toJSONString(ebook_entryServcie.selInfo(categoryId));
    }
    @RequestMapping("insInfo")
    public String insInfo(@RequestBody Ebook_Entry ebook_entry){
        return JSON.toJSONString(ebook_entryServcie.insInfo(ebook_entry));
    }

    @RequestMapping("delInfo/{id}")
    public String delInfo(@PathVariable(value = "id")Integer id){
        return JSON.toJSONString(ebook_entryServcie.delInfo(id));
    }

    @RequestMapping("updInfo")
    public String updInfo(@RequestBody Ebook_Entry ebook_entry){
        return JSON.toJSONString(ebook_entryServcie.updInfo(ebook_entry));
    }
    @RequestMapping("selInfoById/{id}")
    public String selInfoById(@PathVariable(value = "id") Integer id){
        return JSON.toJSONString(ebook_entryServcie.selInfoById(id));
    }
}
