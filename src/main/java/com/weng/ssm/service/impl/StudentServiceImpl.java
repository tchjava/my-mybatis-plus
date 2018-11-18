package com.weng.ssm.service.impl;

import com.weng.ssm.domain.Student;
import com.weng.ssm.mapper.StudentMapper;
import com.weng.ssm.service.StudentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author weng
 * @since 2018-11-18
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
