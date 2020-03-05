public class Study {
  public static void main(String[] args) {
    ExamStrings examStrings = new ExamStrings("Hello World");
    ExamStrings examStrings2 = new ExamStrings("Hello World #2");
    ExamStrings.examString = "static string";

    System.out.println(ExamStrings.examString);


    examStrings.assignStatic("newString");


    System.out.println(ExamStrings.examString);

    examStrings2.printExamString();

    System.out.println(examStrings2.string);
    System.out.println(examStrings2.string);

  }
}
