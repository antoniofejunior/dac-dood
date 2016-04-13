package ifpb.dac.dood.cdi;

import ifpb.dac.dood.IFCalculadora;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 * @author Ricardo Job
 */
@ApplicationScoped
public class ProducersResource {
    
    @Produces 
    @Resource(lookup = "java:global/DAC_Dood-core/CalculadoraImpl")
    private IFCalculadora calculadora;

}
