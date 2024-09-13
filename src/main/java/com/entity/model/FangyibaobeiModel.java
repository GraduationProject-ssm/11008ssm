package com.entity.model;

import com.entity.FangyibaobeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 防疫报备
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-13 17:05:14
 */
public class FangyibaobeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 行动轨迹
	 */
	
	private String xingdongguiji;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 现所在地
	 */
	
	private String xiansuozaidi;
				
	
	/**
	 * 设置：行动轨迹
	 */
	 
	public void setXingdongguiji(String xingdongguiji) {
		this.xingdongguiji = xingdongguiji;
	}
	
	/**
	 * 获取：行动轨迹
	 */
	public String getXingdongguiji() {
		return xingdongguiji;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：现所在地
	 */
	 
	public void setXiansuozaidi(String xiansuozaidi) {
		this.xiansuozaidi = xiansuozaidi;
	}
	
	/**
	 * 获取：现所在地
	 */
	public String getXiansuozaidi() {
		return xiansuozaidi;
	}
			
}
