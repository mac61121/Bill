package cn.bdqn.billprovider.service;

import cn.bdqn.pojo.Ebook_Entry;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Ebook_EntryServcie {
    /**
     * 获取全部书籍数据
     * @return
     */
    List<Ebook_Entry> selInfo(@Param(value = "categoryId") Integer categoryId);
    /**
     * 新增书籍信息
     * @param ebook_entry
     * @return
     */
    Integer insInfo(Ebook_Entry ebook_entry);
    /**
     * 根据id删除书籍信息
     * @param id
     * @return
     */
    Integer delInfo(@Param(value = "id") Integer id);

    /**
     * 修改书籍数据
     * @param ebook_entry
     */
    int updInfo(Ebook_Entry ebook_entry);
    /**
     * 根据id查一本书的信息
     * @param id
     * @return
     */
    Ebook_Entry selInfoById(@Param(value = "id") Integer id);
}
