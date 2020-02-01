package com.secondhand.common.basemethod;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * 返回一个分页的结果数据
 *
 * @param <T>
 * @author Erica
 */
public class PageApiResult<T> extends ApiResult<PageList<T>> {

    /**
     * 通过列表直接构建结果
     *
     * @param total
     * @param dataList
     */
    public PageApiResult(long total, List<T> dataList) {
        super(0, null, new PageList<T>(total, dataList));
    }

    /**
     * 通过Page对象来构建结果
     *
     * @param page
     */
    public PageApiResult(IPage<T> page) {
        super(0, null, new PageList<>(page.getTotal(), page.getRecords()));
    }

}
