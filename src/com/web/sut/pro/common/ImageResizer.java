package com.web.sut.pro.common;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 调整图片大小
 * @param srcImgPath   原路径
 * @param distImgPath  生成后的路径
 * @param width        宽
 * @param height       高
 * */
public class ImageResizer {
	
	public static void resizeImage(String srcImgPath, String distImgPath, int width, int height) throws IOException {
		File srcFile = new File(srcImgPath);
		Image srcImg = ImageIO.read(srcFile);
		BufferedImage buffImg = null;
		buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		buffImg.getGraphics().drawImage(srcImg.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
		ImageIO.write(buffImg, "png", new File(distImgPath));
	}
	
}
