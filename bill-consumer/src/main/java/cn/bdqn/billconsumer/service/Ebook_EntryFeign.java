package cn.bdqn.billconsumer.service;

import cn.bdqn.pojo.Ebook_Entry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@FeignClient("bill-provider")
public interface Ebook_EntryFeign {
    /**
     * 获取所有书籍信息
     * @param categoryId
     * @return
     */
    @RequestMapping("selInfo/{categoryId}")
    public String selInfo(@PathVariable(value = "categoryId") Integer categoryId);

    /**
     * 新增书籍信息
     * @param ebook_entry
     * @return
     */
    @RequestMapping("insInfo")
    public String insInfo(@RequestBody Ebook_Entry ebook_entry);

    /**
     * 根据id删除书籍信息
     * @param id
     * @return
     */
    @RequestMapping("delInfo/{id}")
    public String delInfo(@PathVariable(value = "id")Integer id);

    /**
     * 修改书籍信息
     * @param ebook_entry
     * @return
     */
    @RequestMapping("updInfo")
    public String updInfo(@RequestBody Ebook_Entry ebook_entry);

    /**
     * 获取一本书的信息
     * @param id
     * @return
     */
    @RequestMapping("selInfoById/{id}")
    public String selInfoById(@PathVariable(value = "id") Integer id);
}
