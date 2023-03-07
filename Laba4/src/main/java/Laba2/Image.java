package Laba2;

import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
//����� ������������ ��������
public class Image extends JComponent {

    private BufferedImage image;

    public Image() {
        try {
            Path path = Paths.get("������� �����.jpg");
            BufferedImage bi = ImageIO.read(path.toFile());
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bi, "jpg", baos);
            byte[] bytes = baos.toByteArray();
            InputStream is = new ByteArrayInputStream(bytes);
            image = ImageIO.read(is);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    //���������������� ����� ��������� ��������
    public void paintComponent(Graphics g) {
        if (image==null) return;//���� �������� ����������

        g.drawImage(image, 20, 20, null);
    }

}