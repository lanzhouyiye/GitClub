package tellh.com.gitclub.model.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by tlh on 2016/8/26 :)
 */
public class UserInfo implements Parcelable {

    /**
     * login : TellH
     * id : 15800681
     * avatar_url : https://avatars.githubusercontent.com/u/15800681?v=3
     * gravatar_id :
     * url : https://api.github.com/users/TellH
     * html_url : https://github.com/TellH
     * followers_url : https://api.github.com/users/TellH/followers
     * following_url : https://api.github.com/users/TellH/following{/other_user}
     * gists_url : https://api.github.com/users/TellH/gists{/gist_id}
     * starred_url : https://api.github.com/users/TellH/starred{/owner}{/repo}
     * subscriptions_url : https://api.github.com/users/TellH/subscriptions
     * organizations_url : https://api.github.com/users/TellH/orgs
     * repos_url : https://api.github.com/users/TellH/repos
     * events_url : https://api.github.com/users/TellH/events{/privacy}
     * received_events_url : https://api.github.com/users/TellH/received_events
     * type : User
     * site_admin : false
     * name : 乐华
     * company : studying in college
     * blog : http://blog.csdn.net/tellh?viewmode=contents
     * location : GuangDong
     * email : 570495627@qq.com
     * hireable : null
     * bio : Stay hungry, stay foolish.
     * public_repos : 35
     * public_gists : 0
     * followers : 13
     * following : 37
     * created_at : 2015-11-11T13:28:55Z
     * updated_at : 2016-08-22T12:16:31Z
     */

    private String login;
    private int id;
    private String avatar_url;
    private String html_url;
    private String name;
    private String company;
    private String blog;
    private String location;
    private String email;
    private String bio;
    private int public_repos;
    private int followers;
    private int following;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.login);
        dest.writeInt(this.id);
        dest.writeString(this.avatar_url);
        dest.writeString(this.html_url);
        dest.writeString(this.name);
        dest.writeString(this.company);
        dest.writeString(this.blog);
        dest.writeString(this.location);
        dest.writeString(this.email);
        dest.writeString(this.bio);
        dest.writeInt(this.public_repos);
        dest.writeInt(this.followers);
        dest.writeInt(this.following);
    }

    public UserInfo() {
    }

    protected UserInfo(Parcel in) {
        this.login = in.readString();
        this.id = in.readInt();
        this.avatar_url = in.readString();
        this.html_url = in.readString();
        this.name = in.readString();
        this.company = in.readString();
        this.blog = in.readString();
        this.location = in.readString();
        this.email = in.readString();
        this.bio = in.readString();
        this.public_repos = in.readInt();
        this.followers = in.readInt();
        this.following = in.readInt();
    }

    public static final Parcelable.Creator<UserInfo> CREATOR = new Parcelable.Creator<UserInfo>() {
        @Override
        public UserInfo createFromParcel(Parcel source) {
            return new UserInfo(source);
        }

        @Override
        public UserInfo[] newArray(int size) {
            return new UserInfo[size];
        }
    };
}
