package mao.spring_mvc_file_upload;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * Project name(项目名称)：Spring_MVC_file_upload
 * Package(包名): mao.spring_mvc_file_upload
 * Class(类名): FileUploadController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/11
 * Time(创建时间)： 16:33
 * Version(版本): 1.0
 * Description(描述)： 无
 */


@Controller
public class FileUploadController
{
    private static final Log log = LogFactory.getLog(FileUploadController.class);

    /**
     * Gets file upload.
     *
     * @return the file upload
     */
    @RequestMapping("test")
    public String getFileUpload()
    {
        return "/fileUpload";
    }

    /**
     * One file upload string.
     *
     * @param fileDomain the file domain
     * @param request    the request
     * @return the string
     */
    @RequestMapping("/fileUpload")
    public String oneFileUpload(@ModelAttribute FileDomain fileDomain, HttpServletRequest request)
    {
        String fileName = fileDomain.getMyFile().getOriginalFilename();
        // 上传
        try
        {
            fileDomain.getMyFile().transferTo(new File("D:\\" + fileName));
            log.info("成功");
            log.info(fileDomain.getDescription());
            request.setAttribute("fileDomain", fileDomain);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return "showFile";
    }


    /**
     * Multi file string.
     *
     * @return the string
     */
    @RequestMapping("/test1")
    public String multiFile()
    {
        return "multiFiles";
    }


    /**
     * Multi file upload string.
     *
     * @param multiFileDomain the multi file domain
     * @param request         the request
     * @return the string
     */
    @RequestMapping("/multiFile")
    public String multiFileUpload(@ModelAttribute MultiFileDomain multiFileDomain, HttpServletRequest request)
    {
        List<MultipartFile> files = multiFileDomain.getMyFile();
        System.out.println("files" + files);
        for (int i = 0; i < files.size(); i++)
        {
            MultipartFile file = files.get(i);
            String fileName = file.getOriginalFilename();
            File targetFile = new File("D:\\" + fileName);
            // 上传
            try
            {
                file.transferTo(targetFile);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return "showMulti";
    }
}
