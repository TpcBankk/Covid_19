package com.example.covid_19;

public class QuestionLibrary {
    public static String[] mQuestion= new String[] {
            "คุณมีประวัติการเดินทางไปในพื้นที่กลุ่มเสี่ยง",
            "คุณมีประวัติใกล้ชิดกับบบุคคลที่มีประวัติการเดินทางไปในพื้นที่กลุ่มเสี่ยง",
            "คุณมีประวัติใกล้ชิดหรือสัมผัสกับผู้ที่ป่วย COVID-19",
            "ประกอบอาชีพที่ต้องพบชาวต่างชาติและบุคลากรทางการแพทย์ที่ต้องดูแลผู้ป่วย",
            "คุณมีไข้สูง 37.5 องศาเซลเซียส ขึ้นไป หรือ รู้สึกว่ามีไข้",
            "คุณมีอาการเจ็บคอรึเปล่า",
            "คุณมีอาการไอแห้งรึเปล่า",
            "คุณมีอาการมีน้ำมูกรึเปล่า",
            "คุณมีอาการเหนื่อยหอบหายใจลำบากหรือปวดกล้ามเนื้อรึเปล่า",
            "คุณมีโรคประจำตัวรึเปล่า",
            "",

    };

    public static String[][] mChoices = new String[][] {
            {"มีประวัติการเดินทางไปในพื้นที่กลุ่มเสี่ยง", "ไม่มีประวัติการเดินทางไปในพื้นที่กลุ่มเสี่ยง"},
            {"มีประวัติใกล้ชิดกับบุคคลกลุ่มเสี่ยง", "ไม่มีประวัติใกล้ชิดกับบุคคลลุ่มเสี่ยง"},
            {"มีประวัติใกล้ชิดกับผู้ที่ป่วย", "ไม่มีประวัติใกล้ชิดกับผู้ที่ป่วย"},
            {"ประกอบอาชีพดังกล่าว", "ไม่ได้ประกอบอาชีพดังกล่าว"},
            {"อุณหภูมิต่ำกว่า 37.5 องศาเซลเซียส และไม่รู้สึกมีไข้", "อุณหภูมิสูงกว่า 37.5 องศาเซลเซียส และรู้สึกมีไข้"},
            {"มีอาการดังกล่าว", "ไม่มีอาการดังกล่าว"},
            {"มีอาการดังกล่าว", "ไม่มีอาการดังกล่าว"},
            {"มีอาการดังกล่าว", "ไม่มีอาการดังกล่าว"},
            {"มีอาการดังกล่าว", "ไม่มีอาการดังกล่าว"},
            {"มี", "ไม่มี"},
            {"", ""},
    };

    public static String[] mCorrectAnswer = new String[] {"มีประวัติการเดินทางไปในพื้นที่กลุ่มเสี่ยง", "มีประวัติใกล้ชิดกับบุคคลกลุ่มเสี่ยง", "มีประวัติใกล้ชิดกับผู้ที่ป่วย", "ประกอบอาชีพดังกล่าว",
            "อุณหภูมิต่ำกว่า 37.5 องศาเซลเซียส และไม่รู้สึกมีไข้","มีอาการดังกล่าว","มีอาการดังกล่าว","มีอาการดังกล่าว","มีอาการดังกล่าว","มี",""};

    public String getQuestion(int a){
        String question = mQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return  choice0;
    }
    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return  choice1;
    }

    public  String getCorrentAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }

    public int getCount() {
        return mQuestion.length;
    }
}

