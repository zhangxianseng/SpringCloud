package com.spring.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/16 10:57
 */
@Data
@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)//链表的访问
public class Depts implements Serializable{
    //主键
    private long did;
    //名称
    private String name;
    // 来自哪个数据库,因为微服务架构可以一个服务连接独立的一个数据库 , 同一个消息可以存储到不同的数据库
    private String db_source;

}
