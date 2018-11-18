package com.weng.ssm.service.impl;

import com.weng.ssm.domain.Course;
import com.weng.ssm.mapper.CourseMapper;
import com.weng.ssm.service.CourseService;
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
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

}
