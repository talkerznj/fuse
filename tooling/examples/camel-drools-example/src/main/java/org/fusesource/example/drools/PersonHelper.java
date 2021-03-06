/*
 * Copyright 2012 Red Hat
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.fusesource.example.drools;

import java.util.Random;

public class PersonHelper {
	private final Random random = new Random();

	public Person createTestPerson() {
		Person person = new Person();
		if (random.nextBoolean()) {
			person.setName("Old Person");
			person.setAge(21);
		} else {
			person.setName("Young Person");
			person.setAge(18);
		}
		return person;
	}

}
