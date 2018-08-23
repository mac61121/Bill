package cn.bdqn.billprovider.service.impl;

import cn.bdqn.billprovider.dao.Ebook_EntryDao;
import cn.bdqn.billprovider.service.Ebook_EntryServcie;
import cn.bdqn.pojo.Ebook_Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ebook_EntryServcie")
public class Ebook_EntryServiceimpl implements Ebook_EntryServcie {
    @Autowired
    private Ebook_EntryDao dao;

    @Override
    public List<Ebook_Entry> selInfo(Integer categoryId) {
        return dao.selInfo(categoryId);
    }

    @Override
    public Integer insInfo(Ebook_Entry ebook_entry) {
        return dao.insInfo(ebook_entry);
    }

    @Override
    public Integer delInfo(Integer id) {
        return dao.delInfo(id);
    }

    @Override
    public int updInfo(Ebook_Entry ebook_entry) {
        try {
            dao.updInfo(ebook_entry);
        } catch (Exception e) {
           return 0;
        }
        return 1;
    }

    @Override
    public Ebook_Entry selInfoById(Integer id) {
        return dao.selInfoById(id);
    }
}
