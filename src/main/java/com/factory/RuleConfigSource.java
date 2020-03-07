package com.factory;

//public class RuleConfigSource {
//    public RuleConfig load(String ruleConfigFilePath) {
//        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
//        IRuleConfigParserFactory parserFactory = RuleConfigParserFactory.createParser();
//
//        IRuleConfigParser parser = createParser(ruleConfigFilePath);
//        if (parser == null) {
//            throw new InvalidRuleConfigException(
//                    "Rule config file format is not supported:" + ruleConfigFilePath);
//        }
//
//        String configText = "";
//        RuleConfig ruleConfig = parser.parse(configText);
//        return ruleConfig;
//    }
//
//    private IRuleConfigParser createParser(String ruleConfigFilePath) {
//        IRuleConfigParser = null;
//        if ("json".equalsIgnoreCase(ruleConfigFilePath)) {
//            parser = new JsonRuleConfigParser();
//        } else if ("xml".equalsIgnoreCase(ruleConfigFilePath)) {
//            parser = new XmlRuleConfigParser();
//        } else if ("yaml".equalsIgnoreCase(ruleConfigFilePath)) {
//            parser = new YamlRuleConfigParser();
//        } else {
//            throw new InvalidRuleConfigException(
//                    "Rule config file format is not supported:" + ruleConfigFilePath
//            );
//        }
//        return parser;
//    }
//
//    private String getFileExtension(String filePath) {
//        return "json";
//    }
//}
