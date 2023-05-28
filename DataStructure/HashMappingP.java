package DataStructureX.Algorthims.DataStructure;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.UUID;

public class HashMappingP {
    public static void main(String[] args) {
        HashMap<UUID,Person> hashMap = new HashMap<>();
        hashMap.put(UUID.fromString("97485d37-3be3-41c4-a631-fc09b07df3f4"),new Person(123,"Ahmet"));
        hashMap.put(UUID.fromString("b0f4a689-1e5c-4013-bc7d-1920e27b21ac"),new Person(123,"Mariam"));
        hashMap.put(UUID.fromString("8e52afe4-5c7a-4e55-a8a6-60d750798144"),new Person(123,"Ahmet"));
        System.out.println(hashMap);
        System.out.println(hashMap.get(UUID.fromString("8e52afe4-5c7a-4e55-a8a6-60d750798144")));
        System.out.println(hashMap.containsKey(UUID.fromString("8e52afe4-5c7a-4e55-a8a6-60d750798144")));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.entrySet());

        hashMap.entrySet().forEach(x -> System.out.println(x.getKey()+" "+x.getValue()));
        hashMap.forEach((uuid, person) -> {
            System.out.println(uuid+" - "+person);
        });

    }

    public static class Person{
        static int userId;
        String name;

        public Person(int userId, String name) {
            this.userId = userId;
            this.name = name;
        }

        public static int getUserId() {
            return userId;
        }

        public static void setUserId(int userId) {
            Person.userId = userId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
