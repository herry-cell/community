package life.sgldts.community.model;

import lombok.Data;

/**
 * @author herry
 * @create 2020-06-26-22:09
 */

@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
