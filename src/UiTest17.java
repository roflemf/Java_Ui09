import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/* 방향키로 자동차 이동하기 */


class MyPanel17 extends JPanel{
	BufferedImage img=null; //BufferedImage 는 이미지를 읽어들여서 임시메모리에 저장(버퍼링)한다.
	int img_x = 100, img_y = 100;

	public MyPanel17() {
		try {
			img = ImageIO.read(new File("./images/car.jpg")); //STS 개발툴에서 인식하는 현재경로는 
			//해당 프로젝트 경로인 Java_Ui09 이다.
		}catch (IOException ie) {
			System.out.println("자동차 이미지 없다.");
			System.out.println(1);
			/* 0이면 문제 없이 종료,
			 * 1이면 문제 있으면 종료
			 */
		}

		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode(); //키코드값을 구함
				switch(keyCode) {
				case KeyEvent.VK_UP: img_y -= 10; break; //위로 가는 방향키일 때 y좌표값 10 감소
				case KeyEvent.VK_DOWN: img_y += 10; break; //아래로 가는 방향키일 때 y좌표값 10 증가
				case KeyEvent.VK_LEFT: img_x -= 10; break; //왼쪽으로 가는 방향키일 때 x좌표값 10 감소
				case KeyEvent.VK_RIGHT: img_x += 10; break; //오른쪽으로 가는 방향키일 때 x좌표값 10 증가

				}

				repaint(); //다시 그리고자 paintComponent()메서드 호출
			}//키보드를 눌렀을때 호출

		});//익명 클래스 문법으로 키 이벤트 등록

		this.requestFocus(); /*스윙 패널은 키보드 포커스를 기본으로 받을 수 없다.  키보드 포커스 요청*/
		setFocusable(true); // 패널이 키보드 포커스를 받을 수 있게 한다.
	}//생성자

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null); //해당 자동차 이미지를 x,y 좌표에 그린다.
											  //null은 이미지 관찰자(이미지 제대로 출력되나 감시)
	}//무엇을 그리고자 호출되는 메서드

}
public class UiTest17 extends JFrame{
	public UiTest17() {
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel17()); //프레임에 패널 추가
		setVisible(true);
	}//생성자

	public static void main(String[] args) {
		new UiTest17(); //생성자 호출
	}
}
