package life.sgldts.community.dto;

import lombok.Data;

/**
 * @author herry
 * @create 2020-06-26-17:38
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
