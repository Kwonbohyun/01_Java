//package com.ohgiraffers.lamda.test;
//
//
//public class Application1 {
//}
///**
// * @실습문제5
// * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
// * 문자열리스트 {"뮻","","대한민국","  "}를 체크하세요.
// * </pre>
// */
//
//private void test5() {
//    // List<String> strList = A
//
//
//}
//
//public void test5_General() {
//
//    // List를 만드는 방법 1
//    List<String> strList1 = new ArrayList<>();
//    strList1.add("abc");
//    strList1.add("");
//    strList1.add("대한민국");
//    strList1.add("      ");
//
//    // List를 만드는 방법 2
//    // Arrays.asList() : 나열된 값을 리스트로 만들어준다.
//    // asList()로 만든 리스트의 경우, 컬렉션 프레임워크가 아닌 Arrays 클래스 내부의
//    static
//    List<String> strList2 = new ArrayList<>(Arrays.asList("abc", "", "대한민국", "      "));
//
//
//    // List를 만드는 방법 3
//    // List.of() : 팩토리메소드, 나열된 값을 리스트로 만들어준다.
//    // List.of()로 만든 리스트는 ImmutableCollections 객체의 내부클래스인 ListN 클래스로 List를 생성
//    // -> 추가, 삭제 불가능 / 변경만 가능하다.
//    List<String<> strListOfTest =
//    // List<String> strListOfTest = new ArrayList<>(List.of("1","2"));
//
//    /*
//    * List.of(), Arrays.asList() -> 추가, 삭제 불가능하게 한 이유
//    불변객체이어야 다른 컬렉션으로 변환이 용이하기 때문
//    * */
//
//
//
//    // 공백을 제외한 문자열의 길이가 0인지 판단
//    for(String str : strList1) {
//        // 문자열을 trim() -> 공백을 앞뒤로 다 지우는
//
//        Boolean isLengthZero = str.trim().length() == 0;
//
//        System.out.println("[" + str + "]의 길이는 0입니까? " + isLengthZero);
//    }
//}