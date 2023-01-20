package dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import dto.ReviewLikeDTO;

public class ReviewLikeDaoImpl implements ReviewLikeDAO{

	private SqlSessionTemplate sqlSession;
	
	public ReviewLikeDaoImpl() {
	}
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public int review_like_count(int review_like_review_seq) {
		return sqlSession.selectOne("reviewLike.like_counts", review_like_review_seq);
	}

	@Override
	public void review_like_insert(ReviewLikeDTO dto) {
		sqlSession.insert("reviewLike.like_insert", dto);
	}

	@Override
	public void review_like_delete(int review_like_review_seq) {
		sqlSession.delete("reviewLike.like_delete", review_like_review_seq);
	}

	@Override
	public int review_like_view(HashMap<String, Object> map) {
		return sqlSession.selectOne("reviewLike.like_views", map);
	}

}
