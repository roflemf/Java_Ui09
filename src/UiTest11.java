import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * 
 * 
 */
public class UiTest11 {
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setTitle("온도 변환기"); //스윙 프레임 윈도우 제목 설정
	JPanel panel  = new JPanel(); //스윙 패널은 각 컴포넌트들을 그룹화해서 배치하는 컨테이너 즉 레이아웃이다.
	f.add(panel); //스윙 프레임윈도우에 스윙 패널 추가
	
	/* 배치관리자 기본값)
	 * 	1. 스윙 프레임 윈도우인 JFrame은 기본 배치관리자로 보더 레이아웃이다.
	 * 	2. 스윙 패널은 기본 배치관리자로 플로우 레이아웃이다.
	 * 
	 * 
	 */
	
	JLabel label01 = new JLabel("화씨 온도"); //JLabel은 설명을 덧붙일 때 사용
	JLabel label02 = new JLabel("섭씨 온도");
	JTextField field01 = new JTextField(15); //JTextField는 한줄 입력필드를 만든다.
	JTextField field02 = new JTextField(15);
	JButton button  = new JButton("변환");
	
	panel.add(label01);//패널에 추가
	panel.add(field01);
	panel.add(label02);
	panel.add(field02);
	panel.add(button);
	
	f.setSize(300,150);
	
	//스윙 프레임 윈도우 정 중앙에
//	Dimension frameSize = f.getSize(); //스윙 프레임 크기      
//    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();//모니터 크기      
//    f.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
//    // (모니터화면 가로 - 프레임화면 가로) / 2, (모니터화면 세로 - 프레임화면 세로) / 2
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//스윙 프레임 윈도우 닫기
	f.setVisible(true);//스윙 프레임 윈도우 보이게 하기
	
	
	/* 문제)
	 * 스윙 프레임 윈도우를 정 중앙에 나오게 만들어보기
	 */
	
	f.setLocationRelativeTo(null);
	
	
}
}
