package mao.spring_mvc_file_upload;

import org.springframework.web.multipart.MultipartFile;

/**
 * Project name(项目名称)：Spring_MVC_file_upload
 * Package(包名): mao.spring_mvc_file_upload
 * Class(类名): FileDomain
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/11
 * Time(创建时间)： 16:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public class FileDomain
{
    private String description;
    private MultipartFile myFile;

    /**
     * Instantiates a new File domain.
     */
    public FileDomain()
    {
    }

    /**
     * Instantiates a new File domain.
     *
     * @param description the description
     * @param myFile      the my file
     */
    public FileDomain(String description, MultipartFile myFile)
    {
        this.description = description;
        this.myFile = myFile;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * Gets my file.
     *
     * @return the my file
     */
    public MultipartFile getMyFile()
    {
        return myFile;
    }

    /**
     * Sets my file.
     *
     * @param myFile the my file
     */
    public void setMyFile(MultipartFile myFile)
    {
        this.myFile = myFile;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("description：").append(description).append('\n');
        stringbuilder.append("myFile：").append(myFile).append('\n');
        return stringbuilder.toString();
    }
}
