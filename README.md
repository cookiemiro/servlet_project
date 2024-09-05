Todo 웹 프로그램

- 목록화면(list) - GET  // TodoReadController
  - 목록화면은 GET 방식으로 조회하는 화면
  - 등록, 수정, 삭제 후에도 결과를 확인할 수 있는 화면

- 등록화면(Register) - GET
  - GET 이동하기 때문에 등록 화면 register.jsp 페이지 이동

- 등록화면(Register) - POST
  - 입력데이터들을 POST 방식으로 서버 전송 ==> 별도의 Controller 가 추가되어야 한다. // TodoRegisterController
  - 처리한 후 Redirect 방식으로 다시 목록페이지로 돌아간다.
  - 목록페이지로 돌아간 후 새롭게 등록된 글이 반영되어 목록을 보여줘야 한다.

- 조회화면(Read) - GET 방식으로 동작 설계 목록화면에서 특정 Todo 글번호를 누르면 동작하도록 설계

- 수정/삭제 (remove/delete) - GET 방식 설계 (해당 페이지로 이동)

- 수정/삭제 화면에서는 POST 방식으로 수정, 삭제 진행할 수 있도록 버튼을 추가
  (TodoModifyController, TodoRemoveController)

- 수정화면(modify) - POST ==> 목록화면(list)로 redirect

- 삭제화면(delete) - POST ==> 목록화면(list)로 redirect