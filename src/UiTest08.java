import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//3번째 이벤트 처리
class FrameEvent08 extends Frame implements ActionListener{
	Button orangeBtn, yellowBtn;
	
	public FrameEvent08() {
		setLayout(new FlowLayout());
		
		orangeBtn  = new Button("Orange");
		yellowBtn = new Button("Yellow");
		add(orangeBtn); add(yellowBtn);
		
		orangeBtn.addActionListener(this);//각 버튼 이벤트 등록
		yellowBtn.addActionListener(this);
		
		setSize(700,500); setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			
		});
		
	}//생성자

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == orangeBtn) {//getSource()메서드는 이벤트 소스 객체를 구함
			this.setBackground(Color.ORANGE); //프레임 배경색을 오렌지로 변경
		}else {
			setBackground(Color.YELLOW);// this. 은 생략가능
		}
	}//버튼 클릭시 호출
	
}
public class UiTest08 {
public static void main(String[] args) {
	new FrameEvent08();
}
}
