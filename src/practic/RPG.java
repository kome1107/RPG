package practic;

import java.util.ArrayList;
import java.util.List;

public class RPG {
	public static void main(String[] args) {

		Human[] h = new Human[] { new Brave("勇者", 200, 10), new Fighter("戦士", 200, 4), new Wizard("魔法使い", 100, 6), };

		Monster[] m = new Monster[] { new Slime("スライム", 150, 2), new Oak("オーク", 150, 6),
				new Dragon("ドラゴン", 200, 12) };

		List<Human> humans = new ArrayList<Human>();
		humans.add(h[0]);
		humans.add(h[1]);
		humans.add(h[2]);

		List<Monster> monsters = new ArrayList<Monster>();
		monsters.add(m[0]);
		monsters.add(m[1]);
		monsters.add(m[2]);

		while (true) {

			Human i = humans.get(Rand.get(humans.size()));
			Monster n = monsters.get(Rand.get(monsters.size()));

			System.out.println("人間のターン!");
			i.attack(n);

			if (n.hp <= 0) {
				monsters.remove(n);
				if (0 == monsters.size()) {
					break;
				}
			}

			i = humans.get(Rand.get(humans.size()));
			n = monsters.get(Rand.get(monsters.size()));

			System.out.println("モンスターのターン！");
			n.attack(i);
			if (i.hp <= 0) {
				humans.remove(i);
				if (0 == humans.size()) {
					break;
				}
			}

		}
		if (0 == monsters.size()) {
			System.out.println("勇者たちは勝利した！");
		} else if (0 == humans.size()) {
			System.out.println("ドラゴンたちは勝利した！");
		}
	}
}
