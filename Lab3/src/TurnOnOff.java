public interface TurnOnOff
{
    void TurnOn();
    void TurnOff();
	/**
	 * Overrided method to change frequency
	 * @param frequency
	 */
	void ChangeFrequency(int frequency);
}
