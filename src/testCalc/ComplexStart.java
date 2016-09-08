package testCalc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestExistence.class, TestSimple.class, TestComplex.class, RealJob.class })
public class ComplexStart
{

}
