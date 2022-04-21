package practic;

public class Slime extends Monster {

	public Slime(String name, int hp, int offensive) {

		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}

	@Override
	public void attack(Living target) {
		int nn = this.offensive * Rand.get(10);
		System.out.println(this.name + "が体当たりで攻撃！" + target.name + "に" + nn + "のダメージを与えた。");
		target.hp -= nn;
		if (target.hp <= 0) {
			System.out.println(target.name + "は倒れた。");
		}
	}

}
