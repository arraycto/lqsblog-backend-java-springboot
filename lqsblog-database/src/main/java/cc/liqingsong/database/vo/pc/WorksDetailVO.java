package cc.liqingsong.database.vo.pc;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 作品 VO
 * @author liqingsong
 */
@Data
@Accessors(chain = true)
public class WorksDetailVO {
    /** 主键ID */
    private Long id;

    /** 标题 */
    private String title;

    /** keywords */
    private String keywords;

    /** 简介 */
    private String description;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime addtime;

    /** 标签 */
    private List<String> tag;

    /** 内容 */
    private String content;

    /** 点击数 */
    private Long hit;
}
