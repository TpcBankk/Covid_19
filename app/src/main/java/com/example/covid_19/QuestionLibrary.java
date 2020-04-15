package com.example.covid_19;

import java.io.OptionalDataException;

public class QuestionLibrary {
    public static String[] mQuestion= new String[] {
            "คุณมีประวัติการเดินทางไปในพื้นที่กลุ่มเสี่ยง",
            "คุณมีประวัติใกล้ชิดกับบบุคคลที่มีประวัติการเดินทางไปในพื้นที่กลุ่มเสี่ยง",
            "คุณมีประวัติใกล้ชิดหรือสัมผัสกับผู้ที่ป่วย COVID-19",
            "ประกอบอาชีพที่ต้องพบชาวต่างชาติและบุคลากรทางการแพทย์ที่ต้องดูแลผู้ป่วย",

    };
    public static boolean[] answers = new boolean[]{
            true, true, true, true
    };
}


