package com.example.designpattern.factoryBean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class BeanFactory {
    private final Map<Integer, BaseBean> baseBeanMap = new HashMap<>();

    public BeanFactory (List<BaseBean> baseBeanList){
        baseBeanList.forEach(baseBean -> baseBeanMap.put(baseBean.getIndex(), baseBean));
    }

    public BaseBean getBean(int index){
        return Optional.of(baseBeanMap.get(index)).orElseThrow(RuntimeException::new);
    }
}
