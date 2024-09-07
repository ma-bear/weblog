package com.xq.weblog.admin.service;

import com.xq.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.xq.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.xq.weblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.xq.weblog.common.utils.PageResponse;
import com.xq.weblog.common.utils.Response;

/**
 * @author xq
 * @create 2024/9/2 16:30
 */
public interface AdminCategoryService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response addCategory(AddCategoryReqVO addCategoryReqVO);

    /**
     * 分类分页数据查询
     * @param findCategoryPageListReqVO
     * @return
     */
    PageResponse findCategoryList(FindCategoryPageListReqVO findCategoryPageListReqVO);

    /**
     * 删除分类
     * @param deleteCategoryReqVO
     * @return
     */
    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);

    /**
     * 获取文章分类的 Select 列表数据
     * @return
     */
    Response findCategorySelectList();


}

