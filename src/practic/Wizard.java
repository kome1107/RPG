package practic;

public class Wizard extends Human {

	public Wizard(String name, int hp, int offensive) {

		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}

	@Override
	public void attack(Living target) {
		int nn = this.offensive * Rand.get(10);
		System.out.println(this.name +  "が魔法で攻撃！" + target.name + "に" + nn + "のダメージ!を与えた。");
		target.hp -= nn;
		if (target.hp <= 0) {
			System.out.println(target.name + "は倒れた。");
		}
		
	}
}