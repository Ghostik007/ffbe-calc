package Classes.Unit;

import Classes.Stats.*;
import Interfaces.UnitInterface;

public class UnitClass implements UnitInterface {
    protected String name;
    protected String race;
    protected boolean isMan;

    protected BaseStatsClass StatsInnate;
    protected BaseStatsClass Stats;

    protected AilmentStatsClass AilmentsResistanceInnate;
    protected AilmentStatsClass AilmentsResistance;

    protected ElementStatsClass ElementsResistanceInnate;
    protected ElementStatsClass ElementsResistance;

    protected ItemsMatrixClass ItemsAccessInnate;
    protected ItemsMatrixClass ItemsAccess;

    protected RaceDamageBoostClass DamageAgainstRaceInnate;
    protected RaceDamageBoostClass DamageAgainstRace;

    protected SlotsMatrixClass SlotsAccessInnate;
    protected SlotsMatrixClass SlotsAccess;



    public void wear() {

    }

    public void unwear() {

    }

    public void attack() {

    }

    public void defence() {

    }

//    protected SlotsMatrixClass slotsMatrix;
//    protected ItemsMatrixClass itemsMatrix;
}
