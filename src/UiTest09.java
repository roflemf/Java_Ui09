import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEvent09 extends Frame{
	
	Button RedBtn, BlueBtn;
	
	public FrameEvent09() {
		super("FrameWindow Closing");// 프레임 윈도우 제목 설정
		setSize(600,400);
		setVisible(true);
		
		addWindowListener(new EventHandler());//프레임 윈도우 이벤트 등록
	}//생성자
	
	//내부 클래스로 이벤트를 처리 => 외부 클래스명$내부클래스명.class(FrameEvent09$EventHandler.class)
	class EventHandler extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0); // 프레임 윈도우 닫기
		}//프레임 윈도우 닫기 하면 호출
		
	}
	
}

public class UiTest09 {
public static void main(String[] args) {
	new FrameEvent09();
	/* 문제) 
	 * WindowAdapter 추상클래스를 상속받아서 현재 프레임 윈도우 닫기 메서드를 오버라이딩을 해서 닫혀지게 만들어보자
	 * 프레임윈도우 폭은 600, 높이는 400으로 한다.
	 */
}
}
