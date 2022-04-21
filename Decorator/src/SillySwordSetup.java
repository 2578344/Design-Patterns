
public abstract class SillySwordSetup
{
	protected int swordAttackPower;

	public abstract void attack(GameCharacter target);

}

 class SillySwordImpl extends SillySwordSetup {

	 public SillySwordImpl(int swordAttackPower)
     {
         this.swordAttackPower = swordAttackPower;
     }
	 @Override
	 public void attack(GameCharacter target) {
		 target.takeWeaponDamage(swordAttackPower);
	 }
 }

 class SpearImpl extends SillySwordSetup {

	 @Override
	 public void attack(GameCharacter target) {
		 target.takeWeaponDamage(40);
	 }
 }

 abstract class GemDecorator extends SillySwordSetup {
	protected SillySwordSetup sillySwordSetup;

	public GemDecorator(SillySwordSetup sillySwordSetup){
		this.sillySwordSetup = sillySwordSetup;

	}

	 @Override
	 public void attack(GameCharacter target) {
		 this.sillySwordSetup.attack(target);
	 }
 }

class FireGem extends GemDecorator{
	public FireGem(SillySwordSetup sillySwordSetup){
		super(sillySwordSetup);
	}


	@Override
	public void attack(GameCharacter target) {
		sillySwordSetup.attack(target);
		target.takeFireDamage(10);

	}
}

class LesserFireGem extends GemDecorator{
	public LesserFireGem (SillySwordSetup sillySwordSetup){
		super(sillySwordSetup);
	}

	@Override
	public void attack(GameCharacter target) {
		sillySwordSetup.attack(target);
		target.takeFireDamage(5);
	}
}

class GreaterFireGem extends GemDecorator{
	public GreaterFireGem (SillySwordSetup sillySwordSetup){
		super(sillySwordSetup);
	}

	@Override
	public void attack(GameCharacter target) {
		sillySwordSetup.attack(target);
		target.takeFireDamage(20);
	}
}

class LightingGem extends GemDecorator{
	public LightingGem (SillySwordSetup sillySwordSetup){
		super(sillySwordSetup);
	}

	@Override
	public void attack(GameCharacter target) {
		sillySwordSetup.attack(target);
		target.takeLightningDamage(10);
	}
}

class LesserLightningGem extends GemDecorator{
	public LesserLightningGem (SillySwordSetup sillySwordSetup){
		super(sillySwordSetup);
	}

	@Override
	public void attack(GameCharacter target) {
		sillySwordSetup.attack(target);
		target.takeLightningDamage(5);
	}
}


class GreaterLightningGem extends GemDecorator{
	public GreaterLightningGem (SillySwordSetup sillySwordSetup){
		super(sillySwordSetup);
	}

	@Override
	public void attack(GameCharacter target) {
		sillySwordSetup.attack(target);
		target.takeLightningDamage(20);
	}
}

class AttackFix extends SillySwordSetup {

	@Override
	public void attack(GameCharacter target) {

	}
}

