public class Citizen {

        public enum ECitizenType {
                INVALID,
                HUMAN,
                VAMPIRE,
                WEREWOLF
        }
        public enum EkillType {
                INVALID,
                HUNGER,
                VAMPIRE,
                WEREWOLF
        }

        public static final int HUNGER_MAX = 9;
        public static final int HUNGER_MIN = 0;
        public static final int HEALTH_MAX = 99;
        public static final int HEALTH_MIN = 0;

        private int mHunger;
        private int mHealth;
        private EkillType mKilledBy;
        private IBehavior mBehavior;
        private boolean mConvertedHuman;

        // Default Constructor
        public Citizen(IBehavior behavior){
                mHunger = HUNGER_MIN;
                mHealth = HEALTH_MAX;
                mKilledBy = EkillType.INVALID;
                mBehavior = behavior;
                mConvertedHuman =false;
        }

        public void DoTurn(){

                if(mKilledBy == EkillType.INVALID){
                        mBehavior.DoTurn(this);
                }
        }







}
