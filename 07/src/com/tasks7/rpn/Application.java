package com.tasks7.rpn;

import java.util.Deque;
import java.util.LinkedList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

    public static double parse(String rpnString) {

        // new stack
        Deque<Double> stack = new LinkedList<>();

        // match for correct string
        Pattern p = Pattern.compile("^[0-9+\\-*/\\.\\s]+$");
        Matcher m = p.matcher(rpnString);
        if (!m.matches()) {
            throw new RPNParserException();
        }

        // split sting to string array
        String[] inSplit = rpnString.split(" ");

        //
        try {
            Double.parseDouble(inSplit[0]);
            Double.parseDouble(inSplit[1]);
        } catch (Exception e) {
            throw new RPNParserException();
        }

        // last string must be sign
        p = Pattern.compile("^[+\\-*/]$");
        m = p.matcher(inSplit[inSplit.length-1]);
        if (!m.matches()) {
            throw new RPNParserException();
        }

        // rpn calculating
        for (String step: inSplit) {
            switch (step) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    double sub1 = stack.pop();
                    double sub2 = stack.pop();
                    stack.push(sub2 - sub1);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double div1 = stack.pop();
                    double div2 = stack.pop();

                    if (Double.isInfinite(div1) || Double.isNaN(div1) || div1 == 0) {
                        throw new ArithmeticException();
                    } else {
                        double result = div2 / div1;

                        stack.push(result);
                    }
                    break;
                default:
                    stack.push(Double.parseDouble(step));
            }
        }

        // return result
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(parse("10 20 + 30 40 + *"));

    }

}

//Перевірки:
//

//          test("12 2 3 4 * 10 5 / + * +"); //40
//          test("12 2 -3 4 * 10 -5 / + * +"); //-16
//          test("10 20 + 30 40 + *"); //2100
//          test("10 20 30.0 * +"); //610
//          test("10 20 30 () +"); //RPNParserException
//          test("10 20 Е * +"); //RPNParserException
//          test("0 0 /"); //ArithmeticException
//          test("10 * 6 7 +"); //RPNParserException
//          test("10 NaN 6 7 + - *"); //ArithmeticException


//        "^[0-9+\\-*/\\.\\s]+$" — припустимий алфавіт для входу
//        "^-*\\d+(\\.\\d+)*$" — перевірка на число
//        "^[+\\-*/]$" — перевірка на знак
//        Додатково:
//
//        + на вході не NULL
//        + непорожній рядок
//        + послідовність має починатися двома числами
//        послідовність має закінчуватися знаком виконання дії
//        лічильник: за кожне число +1, за кожен знак дії -1, підсумок має дорівнювати 1
//        Якщо якась перевірка з цих не пройшла - викидаємо RPNParserException
//
//        Далі на стек викладаємо числа та результати дій. Для операції ділення перевіряємо на нуль дільник і одразу (без виконання ділення і перехвату виключення) викидаємо ArithmeticException.
//
//        Результат на вершині стека