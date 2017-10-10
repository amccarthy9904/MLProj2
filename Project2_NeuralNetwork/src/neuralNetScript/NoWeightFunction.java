/**
 * 
 */
package neuralNetScript;

/**
 * @author Elias Athey, Tia Smith, Aaron McCarthy
 *
 */
class NoWeightFunction implements IWeightFunction {

	@Override
	public double computeWeights(Node node) {
		return 0;
	}
}
