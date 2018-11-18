package com.weng.ssm.test;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.weng.ssm.domain.Student;
import com.weng.ssm.mapper.StudentMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapper {
    private StudentMapper studentMapper;
    @Before
    public void init(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
         studentMapper= (StudentMapper) ac.getBean("studentMapper");
    }

    /**
     * 插入一条数据
     */
    @Test
    public void fun1() {
        Student student=new Student();
        student.setsId("01");
        student.setsName("zhangsan");
        student.setsBirth("2018-5-12");
        student.setsSex("男");

        Student student1=new Student();
        student1.setsId("02");
        student1.setsName("lisi");
        student1.setsBirth("2018-5-12");
        student1.setsSex("女");

        Student student2=new Student();
        student2.setsId("03");
        student2.setsName("王五");
        student2.setsBirth("2018-5-13");
        student2.setsSex("男");

        Student student3=new Student();
        student3.setsId("04");
        student3.setsName("李四");
        student3.setsBirth("2018-5-14");
        student3.setsSex("女");

        studentMapper.insert(student);
        studentMapper.insert(student1);
        studentMapper.insert(student2);
        studentMapper.insert(student3);
    }

    /**
     * 根据主键删除
     */
    @Test
    public void fun2() {
        Student student=new Student();
        student.setsId("1");
        studentMapper.deleteById(student);
        System.out.println("删除成功----");
    }

    /**
     * deleteMap  根据columMap记录来删除
     */
    @Test
    public void fun3() {
        Map<String, Object> map = new HashMap<>();
        map.put("s_id", "2");
        studentMapper.deleteByMap(map);
        System.out.println("fun3方法执行，删除成功----");
    }

    /**
     * 根据Wrapper
     */
    @Test
    public void fun4() {
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setSqlSelect("s_id={0}","2");
        System.out.println("sql-->:"+entityWrapper.getSqlSegment());
        this.studentMapper.delete(entityWrapper);

        System.out.println("fun4方法执行，删除成功----");
    }

    /**
     *根据主键更新数据
     */
    @Test
    public void fun5() {
        Student student=new Student();
        student.setsId("01");
        student.setsBirth("2018-09-01");
        student.setsBirth("2018-09-02");
        student.setsSex("女");
        student.setsName("张三");
        Integer row=this.studentMapper.updateById(student);
        System.out.println("影响的行数:"+row);
        System.out.println("更新成功----");
    }
    /**
     *根据主键更新数据
     */
    @Test
    public void fun6() {
        Student student=new Student();
        student.setsName("张小三11111");
        //int row=this.studentMapper.update(student, null);

        EntityWrapper entityWrapper = new EntityWrapper();
        Student whereStudent = new Student();
        whereStudent.setsId("03");
        entityWrapper.setEntity(whereStudent);
        int row=this.studentMapper.update(student, entityWrapper);
        System.out.println("影响的行数:"+row);
        System.out.println("更新成功----");
    }

    /**
     * 根据主键查询数据
     */
    @Test
    public void fun7() {

       Student student= this.studentMapper.selectById("01");
        System.out.println("student:"+student.toString());
    }

    /**
     * 根据多个主键查询数据
     */
    @Test
    public void fun8() {
        List<String> list = new ArrayList<>();
        list.add("01");
        list.add("02");
        list.add("03");
        List<Student> students=this.studentMapper.selectBatchIds(list);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    /**
     * 根据map查询
     */
    @Test
    public void fun9() {
        Map<String, Object> queryMap = new HashMap<>();
        queryMap.put("s_sex", "女");
        List<Student> students = this.studentMapper.selectByMap(queryMap);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    /**
     * selectOne
     */
    @Test
    public void fun10() {
        Student student=new Student();
        student.setsSex("女");
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(student);
        List<Student> studentList = this.studentMapper.selectList(entityWrapper);
        for (Student s :
                studentList) {
            System.out.println(s);
        }
    }

    /**
     * selectObjs
     */
    @Test
    public void fun11() {
        Student student=new Student();
        student.setsSex("女");
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(student);
        List<Object> list = this.studentMapper.selectObjs(entityWrapper);
        for (Object obj:
             list) {
            System.out.println(((Student)obj).toString());
        }
    }

    /**
     * selectCount
     */
    @Test
    public void fun12() {
        Student student=new Student();
        student.setsSex("女");
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.setEntity(student);
        int count=this.studentMapper.selectCount(entityWrapper);
        System.out.println("查询到的总数:"+count);
    }
}
