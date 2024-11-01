package com.github.mschieder.idea.formatter;

public class IdeaCodeFormatterMain {
    public static void main(final String[] args) throws Exception {
        int exitStatus;
        try (IdeaCodeFormatterEnvironment formatter = new IdeaCodeFormatterEnvironment()) {
            exitStatus = formatter.format(args, lines -> lines.forEach(System.out::println));
        }
        System.exit(exitStatus);
    }
}