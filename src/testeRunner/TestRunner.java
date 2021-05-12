package testeRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/Componentes.feature", glue = "", tags = "@validar_opção_Mestrado_selecionado_na_combobox")
public class TestRunner {

}
