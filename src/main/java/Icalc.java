public interface Icalc {

    /**
     * Addition-Method.
     *
     * @param num the number to add another number to
     * @param add the number to add
     * @return the sum
     */
    public double add(double num, double add);

    /**
     * Subtraktion-Method.
     *
     * @param num the number to subtract another number from
     * @param sub the number to subtract
     * @return the difference
     */
    public double sub(double num, double sub);

    /**
     * Multiplikation-Method.
     *
     * @param num the number to multiplicate
     * @param mult the factor
     * @return the number multiplicated by the factor
     */
    public double mult(double num, double mult);

    /**
     * Division-Method.
     *
     * @param num the number to divide
     * @param div the factor
     * @return the number divided by the factor
     */
    public int div(int num, int div);

}
