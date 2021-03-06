package com.gjw.mapper;

import com.gjw.pojo.Videos;
import com.gjw.pojo.vo.VideosVo;
import com.gjw.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideosMapperCustom extends MyMapper<Videos> {

    /**
     * 查询所有的视频发布成功的视频信息，并且显示该发布人的头像和昵称
     * @return
     */
    public List<VideosVo> queryAllVideos(@Param("videoDesc") String videoDesc, @Param("userId") String userId);

    /**
	 * @Description: 查询关注的视频
	 */
	public List<VideosVo> queryMyFollowVideos(String userId);

	/**
	 * @Description: 查询点赞视频
	 */
	public List<VideosVo> queryMyLikeVideos(@Param("userId") String userId);
    /**
     * 对视频喜欢的数量进行累加
     * @param videoId
     */
    public void addVideoLikeCount(String videoId);

    /**
     * 对视频喜欢的数量进行累减
     * @param videoId
     */
    public void reduceVideoLikeCount(String videoId);
}