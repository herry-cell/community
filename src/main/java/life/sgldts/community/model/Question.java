package life.sgldts.community.model;

import lombok.Data;

/**
 * @author herry
 * @create 2020-06-28-10:43
 */

@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}
