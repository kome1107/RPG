package practic;

public class Fighter extends Human {

	public Fighter(String name, int hp, int offensive) {

		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}

	@Override
	public void attack(Living target) {
		int nn = this.offensive * Rand.get(10);
		System.out.println(this.name + "が斧で攻撃！" + target.name + "に" + nn + "のダメージ!を与えた。");
		target.hp -= nn;
		if (target.hp <= 0) {
			System.out.println(target.name + "は倒れた。");
		}

	}
}
