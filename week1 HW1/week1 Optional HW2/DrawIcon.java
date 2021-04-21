JavaEnterprise Week1 Optional Question2:
Design an icon (ico or .png) for our course.

package swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class DrawIcon implements Icon {
    private int width;//声明图标的宽
    private int height;//声明图标的长
    @Override
    public int getIconHeight() {
        return this.height;
    }
    @Override
    public int getIconWidth() {
        return this.width;
    }
    public DrawIcon(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void paintIcon(Component arg0, Graphics arg1, int x , int y) {
        arg1.fillOval(x, y, width, height);//绘制一个圆
    }
public static void main(String[] args) {
        
        DrawIcon icon=new DrawIcon(15,15);
        //创建一个标签，使标签文字居中
        JLabel j=new JLabel("测试",icon,SwingConstants.CENTER);
        JFrame jf=new JFrame();
        Container c=jf.getContentPane();
        c.add(j);
        //设置容器的背景颜色
        c.setBackground(Color.white);
        //设置窗体可视
        jf.setVisible(true);
        //设置窗体大小
        jf.setSize(200, 150);
        //设置窗体关闭方式
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

