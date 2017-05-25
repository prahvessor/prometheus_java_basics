package com.tasks5.command;

public class Application {
    static class Help implements Command {
        @Override
        public void execute() {
            System.out.println("Help executed");
        }
    }

    static class Now implements Command {
        @Override
        public void execute() {
            System.out.println(System.currentTimeMillis());
        }
    }

    static class Echo implements Command {
        private String argument;
        Echo(String argument) {
            this.argument = argument;
        }
        @Override
        public void execute() {
            System.out.println(argument);
        }
    }

    static class Exit implements Command {
        @Override
        public void execute() {
            System.out.println("Goodbye!");
        }
    }

    public static void main(String[] args){
        //YOUR CODE COMES HERE
        Command command;
        if (args == null || args.length == 0) {
            System.out.println("Error");
        }else {
            switch (args[0]) {
                case "help":
                    if (args.length == 1 && args[0].equals("help")) {
                        command = new Help();
                        command.execute();
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case "echo":
                    if (args.length == 2 && args[0].equals("echo")) {
                        command = new Echo(args[1]);
                        command.execute();
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case "date":
                    if (args.length == 2 && args[1].equals("now")) {
                        command = new Now();
                        command.execute();
                    }else {
                        System.out.println("Error");
                    }
                    break;
                case "exit":
                    if (args.length == 1 && args[0].equals("exit")) {
                        command = new Exit();
                        command.execute();
                    } else {
                        System.out.println("Error");
                    }
                    break;
                default:
                    System.out.println("Error");
            }
//            command.execute();
        }
    }
}
