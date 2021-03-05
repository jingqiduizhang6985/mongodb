package com.study.mogodbdemo.mongodb;

import com.study.mogodbdemo.entity.User;
import com.study.mogodbdemo.entity.UserParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MongoUser {
    @Autowired
    private MongoTemplate mongoTemplate;
    /**
     * 查询列表
     * @return
     */
    public List<User> findUserList(UserParam param) {
        Query query=new Query();
        List<User> list =  mongoTemplate.find(query , User.class);
        return list;
    }

    /**
     * 根据用户名查询对象
     * @return
     */
    public User findUserByName(String name) {
        Query query=new Query(Criteria.where("name").is(name));
        User mgt =  mongoTemplate.findOne(query , User.class);
        return mgt;
    }
    /**
     * 创建对象
     */
    public User save(User user) {
        return mongoTemplate.save(user);
    }

    /**
     * 更新对象
     */
    public void updateUser(User user) {
        Query query=new Query(Criteria.where("id").is(user.getId()));
        Update update= new Update().set("name", user.getName()).set("idCard",user.getIdCard());
        //更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query,update,User.class);
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,TestEntity.class);
    }

    /**
     * 删除对象
     * @param id
     */
    public void deleteTestById(Integer id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,User.class);
    }
}
