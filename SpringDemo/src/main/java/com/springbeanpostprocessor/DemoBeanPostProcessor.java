package com.springbeanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DemoBeanPostProcessor  implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory c) throws BeansException 
	{
		BeanDefinition bd=c.getBeanDefinition("s_id");
		    MutablePropertyValues mfv=bd.getPropertyValues();
	    mfv.addPropertyValue("sname", "Welcome in java");
	}

}
class BenaAware implements BeanNameAware
{
   private String beanname;
	@Override
	public void setBeanName(String beanname) 
	{
	     this.beanname=beanname;	
	}
	void show()
	{
		System.out.println("bean name="+beanname);
	}

}
