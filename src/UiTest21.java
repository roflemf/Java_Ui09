import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/* 스윙 컴포넌트 종류)
 * 	1. JCheckBox : 네모 버튼을 만들고  하나 또는 하나이상의 복수개를 선택할 수 있다.
 *  2. JRaioButton : JRaioButton 객체를 ButtonGroup에 추가하면 단 하나의 동그라미 버튼만 선택가능하게 된다.
 *  3. JTextArea : 한 줄 이상 여러줄을 입력 할 수 있는 입력박스를 만든다.
 *  4. JComboBox : 화면이 작아서 리스트 항목을 모두 표시할 수 없을 때 선택된 리스트 항목만 표시되고 나머지는 숨겨져서 리스트
 *  			      항목으로 표시하고자 할 때 이 컴포넌트 사용
 * 
 */

//JTextArea 실습 예제
public class UiTest21 extends JFrame implements ActionListener{
	protected JTextField textField;
	protected JTextArea textArea;
	
	public UiTest21() {
		setTitle("TextArea 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField(30);
		textField.addActionListener(this); // 텍스트 필드 이벤트 등록
		
		textArea = new JTextArea(10,30); // 행의 크기가 10, 열의 크기가 30 인 textArea생성
		textArea.setEditable(false); //편집 불가
		
		add(textField, BorderLayout.NORTH); //프레임 북쪽에 텍스트 필드 추가
		add(textArea, BorderLayout.CENTER); //프레임 남쪽에 textArea 추가
		
		pack();// 각 컴포넌트 크기에 맞게 스윙 프레임 윈도우 크기 조절됌 -> setSize메서드 필요없음
		setVisible(true);
		
	}//생성자
	public static void main(String[] args) {
		
		new UiTest21(); //생성자 호출
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = textField.getText(); //텍스트 필드에 입력한 값을 문자열로 구함
		textArea.append(text + "\n");//textArea에 기존내용을 유지한 채 추가하고 다음줄로 줄바꿈(\n)
		textField.selectAll(); //텍스트 필드 전체 선택
	}
	
}
