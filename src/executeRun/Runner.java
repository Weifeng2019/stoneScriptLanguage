package executeRun;
import javassist.gluonj.util.Loader;


/**
 * 基于javassist.gluonj 来执行
 * ---------------------------------
 * 执行:
 * sum = 0
 * i = 1
 * while i < 10  {
 *     sum = sum + i
 *     i = i + 1
 * }
 * sum
 * ----------------------------------
 * 结果：
 * => 0
 * => 1
 * => 10
 * => 45
 */
public class Runner {
    public static void main(String[] args) throws Throwable {
        Loader.run(BasicInterpreter.class, args, BasicEvaluator.class);
    }

}