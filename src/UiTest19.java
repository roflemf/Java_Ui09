import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/* ImageIcon 컴포넌트를 활용해서 스윙 컴포넌트에 이미지 표시하기
 * 
 */
public class UiTest19 extends JFrame implements ActionListener {
	
	private JPanel panel; // 패널은 각 컴포넌트를 그룹화 시켜서 레이아웃 기능을 하는 컨테이너이다. 패널단위로 배치하면 효과적
	private JLabel label; // label은 설명을 덧붙일때
	private JButton button; 
	
	public UiTest19() {
		setTitle("스윙에 그림 배치");
		setSize(600,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		label = new JLabel("이미지 보려면 아래 버튼을 클릭하세요");
		button = new JButton("이미지 레이블");
		ImageIcon icon = new ImageIcon("./images/icon.jpg"); 
		// 스윙 컴포넌트에 이미지를 표시하려면 ImageIcon 객체를 사용한다.
		button.setIcon(icon); //버튼에 이미지 배치
		button.addActionListener(this);// 버튼에 이벤트 등록
		panel.add(label);
		panel.add(button);//패널에 라벨과 버튼 추가
		
		add(panel); //스윙 프레임 윈도우에 패널 추가
		setVisible(true);//항상 보이게 하기
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ImageIcon dogIcon = new ImageIcon("./images/dog.jpg");
		label.setIcon(dogIcon);//라벨에 이미지 배치
		label.setText(null);//라벨 위 문자를 초기화(지운다)
	}
	
	public static void main(String[] args) {
		new UiTest19(); //생성자 호출
	}

}
