package testeRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/Componentes.feature", glue = "", tags = "@Validar_feedback_do_botao_Confirm")
public class TestRunner {

}
