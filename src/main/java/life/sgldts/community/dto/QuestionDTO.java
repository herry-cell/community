package life.sgldts.community.dto;

import life.sgldts.community.model.User;
import lombok.Data;

/**
 * @author herry
 * @create 2020-06-28-20:58
 */

@Data
public class QuestionDTO {
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
    private User user;
}
