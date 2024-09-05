
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import student.Student;
import student.StudentManager;

public class IntegrationSystem_study {

  //	 콘솔 입력 버퍼 생성
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
		IntegrationSystem_study Instance = new IntegrationSystem_study();
		String buffer = null;

		while (true) {
			System.out.println("====== [ 메뉴를 선택 하세요 ] ======");
			System.out.println("1. 학생 관리 시스템");
			System.out.println("2. 시스템 종료");
			System.out.println("--------------------------------");

			int nSel = System.in.read() - 48;
			System.in.skip(System.in.available());

			switch (nSel) {

				case 1:
					while (true) {
						System.out.println("======= [ 학생 관리 시스템 ] =======");
						System.out.println("1. 학생 추가");
						System.out.println("2. 학생 전체 보기");
						System.out.println("3. 학생 검색");
						System.out.println("4. 학생 석차순으로 보기");
						System.out.println("5. 이전으로");
						System.out.println("--------------------------------");
						nSel = System.in.read() - 48;
						System.in.skip(System.in.available());
						switch (nSel) {
							case 1:
								Instance.insertStudent();
								continue;
							case 2:
								Instance.getStudentList();
								continue;
							case 3:
								Instance.searchStudent();
								continue;
							case 4:
								Instance.sortedStudent();
								continue;
							case 5:
								break;
							default:
								continue;
						}
						break;
					}
					continue;
				case 3:
					break;
				default:
					continue;
			}
			break;
		}
	}

  // 학생 삽입
  public void insertStudent() {

  }

  public void sortedStudent() {

  }

  public void getStudentList() {

  }

  public void searchStudent() {

  }


  }
