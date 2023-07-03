import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEvent07 extends Frame{
	Button redBtn, blueBtn;
	
	public FrameEvent07() {
		setTitle("FrameWindow Color Change"); //프레임 윈도우 제목 설정
		setLayout(new FlowLayout()); // 플로우 레이아웃 배치관리자 설정
		
		redBtn=new Button("Red"); // 2개의 버튼 객체 생성
		blueBtn = new Button("Blue");
		add(redBtn); add(blueBtn); //프레임 윈도우에 버튼 추가
		
		//이벤트 핸들러 객체 생성
		ButtonListener07 handler = new ButtonListener07(this); // 프레임 윈도우 내 자신
		redBtn.addActionListener(handler); // 각 버튼 이벤트 등록
		blueBtn.addActionListener(handler);
		
		setSize(600,400); setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}//생성자
	
}//FrameEvent07 class

//이벤트 처리 클래스
class ButtonListener07 implements ActionListener{
	
	Frame frm;
	
	public ButtonListener07() {}
	
	public ButtonListener07(Frame frm) {
		this.frm = frm;
	}//생성자 오버로딩
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Red")) {//버튼 위의 캡션 문자열 내용만 같다면 참. 객체주소는 비교 안함.
			frm.setBackground(Color.RED); //프레임 배경색을 빨간색으로 변경
		}else {
			frm.setBackground(Color.BLUE);
		}
	}//생성자
	
}//ButtonListener07 class
public class UiTest07 {
	public static void main(String[] args) {
		new FrameEvent07();
		
		
	}
}
