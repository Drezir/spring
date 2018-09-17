package core.spel;

import com.sun.org.apache.xalan.internal.extensions.ExpressionContext;
import core.validation.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelCompilerMode;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 17.09.2018
 **/
public class SpelExpressions {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpelExpressions.class);

    public void init() {
        ExpressionParser parser = new SpelExpressionParser();

        Expression exp = parser.parseExpression("'Hello World'.concat('!')");
        LOGGER.info("'Hello World'.concat('!') -> {}", exp.getValue());

        Expression exp1 = parser.parseExpression("'Hello'.bytes");
        LOGGER.info("'Hello'.bytes -> {}", exp1.getValue());

        Expression exp2 = parser.parseExpression("new String('hello world').toUpperCase()");
        LOGGER.info("new String('hello world').toUpperCase() -> {}", exp2.getValue());

        Person person = parser.parseExpression("new core.validation.Person('Adam','Ostrožlík',24)").getValue(Person.class);
        Expression exp3 = parser.parseExpression("name + ' ' + surname");
        EvaluationContext expressionContext = new StandardEvaluationContext(person);
        LOGGER.info("evaluationContext(Person) -> {}", exp3.getValue(expressionContext));

        expressionContext.setVariable("newName", "John");
        parser.parseExpression("name = #newName").getValue(expressionContext);

        SpelParserConfiguration config = new SpelParserConfiguration(SpelCompilerMode.IMMEDIATE, getClass().getClassLoader());
        SpelExpressionParser configuredParser = new SpelExpressionParser(config);
        Expression exp4 = configuredParser.parseExpression("name == 'Adam'");
        LOGGER.info("name == 'Adam' -> {}", exp4.getValue(expressionContext));
    }

}
