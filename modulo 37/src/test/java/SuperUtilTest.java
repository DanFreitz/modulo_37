import br.com.daniel.SuperUtil;
import org.junit.Assert;
import org.junit.Test;

public class SuperUtilTest {

    @Test
    public void escapeHTMLTest() {

        String escapedHtml = SuperUtil.escapeHTML("<script>alert(1);</script>");
        String expected = "&lt;script&gt;alert(1);&lt;/script&gt;";
        Assert.assertEquals(expected, escapedHtml);

    }

}