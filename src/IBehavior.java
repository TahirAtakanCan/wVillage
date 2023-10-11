public interface IBehavior {

    /// perform turn action
    /// return false if nothing to do
    public void DoTurn(Citizen citizen);

    /// Returns the type of citizen this person
    /// appear to be. (Only for werewolves at this point.)
    public Citizen.ECitizenType GetApparentType(Citizen citizen);
}
