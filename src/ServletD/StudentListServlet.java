package ServletD;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**1
 * 配置servlet
 * 1 给 servlet 起名字
 * 2 配置这个名字的servlet的地址
 * 3配置servlet的映射
 * 4 配置用来访问的url地址
 *
* */
public class StudentListServlet extends HttpServlet {
    //初始化
    @Override
    public void init() throws ServletException {

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        Enumeration<String> param =config.getInitParameterNames();
        Enumeration<String> cxtparam = config.getServletContext().getInitParameterNames();
        while (cxtparam.hasMoreElements()){
            System.out.println(cxtparam.nextElement());
        }
    }
    //service
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
    //destroy
    @Override
    public void destroy() {
        super.destroy();
    }
}
