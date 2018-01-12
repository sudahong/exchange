package nuc.onlineeducation.exchange.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Ji YongGuang.
 * @date 23:53 2018/1/7.
 * 常量管理类
 */
public final class Const {

    private Const() {
    }

    public static final String INBOUND_LINKS = "localhost:8080";

    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
    public static final String PHONE = "phone";

    public interface Gender {// 用户性别
        int MALE = 0; // 男
        int FEMALE = 1; // 女
    }

    @AllArgsConstructor
    @Getter
    public enum UserRoleEnum {    // 角色的权限

        ROLE_ADMIN(0,"管理员"),
        ROLE_STUDENT(1,"学生"),
        ROLE_TEACHER(2,"老师");

        private int code;
        private String value;
    }

    public interface TicketStatus {// T票的状态
        int LOG_IN = 0;
        int LOG_OUT = 1;
    }

    public interface CommentStatus {// 评论的状态
        int COMMENT_VISIBLE = 0; // 评论不可见
        int COMMENT_INVISIBLE = 1; // 评论可见
    }

    @AllArgsConstructor
    @Getter
    public enum CommentEntityTypeEnum {
        QUESTION(0,"问题"),
        COMMENT(1,"评论");

        private int code;
        private String value;
    }

    public interface MessageStatus {
        int HAS_READ = 0;// 已读
        int UN_READ = 1;// 未读
    }
}