/**
 * http://surenpi.com
 */
package org.suren.autotest.platform.mapping;

import java.util.List;

import org.suren.autotest.platform.entity.PageInfo;

/**
 * @author suren
 * @date 2017年1月18日 下午8:12:51
 */
public interface PageInfoMapper
{
	List<PageInfo> getAll();
	List<PageInfo> getAllByProjectId(String projectId);
	List<PageInfo> getAllWithContentByProjectId(String projectId);
	
	void save(PageInfo pageInfo);
	int getTotalNum();
	int getCountByProjectId(String projectId);
	
	PageInfo getById(String id);
	List<PageInfo> getAllIds();
	void update(PageInfo pageInfo);
	void delById(String id);
}
