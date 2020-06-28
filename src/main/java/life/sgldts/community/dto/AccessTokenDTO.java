package life.sgldts.community.dto;

import lombok.Data;

/**
 * @author herry
 * @create 2020-06-26-17:21
 */

@Data
public class AccessTokenDTO {

    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}
