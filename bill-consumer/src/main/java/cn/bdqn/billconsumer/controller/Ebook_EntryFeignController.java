package cn.bdqn.billconsumer.controller;

import cn.bdqn.billconsumer.service.Ebook_EntryFeign;
import cn.bdqn.pojo.Ebook_Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ebook_EntryFeignController {
    @Autowired
    private Ebook_EntryFeign ebook_entryFeign;

    /**
     *前往index页面
     * @return
     */
    @RequestMapping("toIndex")
    public String toIndex(){
        return "index";
    }
    /**
     *前往instemp页面
     * @return
     */
    @RequestMapping("toInstemp")
    public String toInstemp(){
        return "instemp";
    }
    /**
     *前往updtemp页面
     * @return
     */
    @RequestMapping("toUpdtemp/{id}")
    public String toUpdtemp(){
        return "updtemp";
    }

    @ResponseBody
    @RequestMapping("selInfo/{categoryId}")
    public String selInfo(@PathVariable(value = "categoryId") Integer categoryId){
        return ebook_entryFeign.selInfo(categoryId);
    }

    @ResponseBody
    @RequestMapping("insInfo")
    public String insInfo(Ebook_Entry ebook_entry){
        return ebook_entryFeign.insInfo(ebook_entry);
    }
    @ResponseBody
    @RequestMapping("delInfo/{id}")
    public String delInfo(@PathVariable(value = "id")Integer id){
        return ebook_entryFeign.delInfo(id);
    }

    @ResponseBody
    @RequestMapping("updInfo")
    public String updInfo(Ebook_Entry ebook_entry){
        return ebook_entryFeign.updInfo(ebook_entry);
    }

    @ResponseBody
    @RequestMapping("selInfoById/{id}")
    public String selInfoById(@PathVariable(value = "id") Integer id){
        return ebook_entryFeign.selInfoById(id);
    }
}
