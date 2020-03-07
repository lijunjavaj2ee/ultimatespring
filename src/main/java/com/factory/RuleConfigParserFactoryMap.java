package com.factory;

import java.util.HashMap;
import java.util.Map;

//public class RuleConfigParserFactoryMap {
//    private static final Map<String,RuleConfigParser> cachedFactories = new HashMap<>();
//
//    static {
//        cachedFactories.put("json",new JsonRuleConfigParser());
//        cachedFactories.put("xml",new XmlRuleConfigParser());
//        cachedFactories.put("yaml",new YamlRuleConfigParser());
//        cachedFactories.put("properties",new PropertiesRuleConfigParser());
//    }
//
//    public static IRuleConfigParser createParser(String configFormat) {
//        if (configFormat == null || configFormat.isEmpty()) {
//            return null;
//        }
//        IRuleConfigParser parser = cachedParsers.get(configFormat.toLowerCase());
//        return parser;
//    }
//
//    public static IRuleConfigParserFactory getParserFactory(String type) {
//        if (type == null || type.isEmpty()) {
//            return null;
//        }
//        IRuleConfigParserFactory parserFactory = cachedFactories.get(type.toLowerCase());
//        return parserFactory;
//    }
//
//
//
//}




