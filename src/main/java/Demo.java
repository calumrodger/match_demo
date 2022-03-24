import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

        public static void main(String[] args) {

            List<String> oneColourManyTimes = Arrays.asList("green", "green", "green");
            List<String> manyColoursOnceEach = Arrays.asList("green", "blue", "red", "orange", "pink", "yellow");
            List<String> manyColoursButNotGreen = Arrays.asList("blue", "red", "orange", "pink", "yellow");


            List<String> oneColourManyTimesList = (
                    oneColourManyTimes
                            .stream()
                            .collect(Collectors.toList()));
            System.out.println(oneColourManyTimesList);

            List<String> manyColoursOnceEachList = (
                    manyColoursOnceEach
                            .stream()
                            .collect(Collectors.toList()));
            System.out.println(manyColoursOnceEachList);

            List<String> manyColoursButNotGreenList = (
                    manyColoursButNotGreen
                            .stream()
                            .collect(Collectors.toList()));
            System.out.println(manyColoursButNotGreenList + "\n");


            System.out.println("allMatch");
            boolean areAllGreen = oneColourManyTimes.stream()
                    .allMatch(p -> p.equals("green"));
            System.out.println("Is everything green? " + areAllGreen);

            boolean areAllGreen2 = manyColoursOnceEach.stream()
                    .allMatch(p -> p.equals("green"));
            System.out.println("Is everything green? " + areAllGreen2);

            boolean areAllGreen3 = manyColoursButNotGreen.stream()
                    .allMatch(p -> p.equals("green"));
            System.out.println("Is everything green? " + areAllGreen3 + "\n");


            System.out.println("anyMatch");
            boolean areAnyGreen = oneColourManyTimes.stream()
                    .anyMatch(p -> p.equals("green"));
            System.out.println("Is anything green? " + areAnyGreen);

            boolean areAnyGreen2 = manyColoursOnceEach.stream()
                    .anyMatch(p -> p.equals("green"));
            System.out.println("Is anything green? " + areAnyGreen2);

            boolean areAnyGreen3 = manyColoursButNotGreen.stream()
                    .anyMatch(p -> p.equals("green"));
            System.out.println("Is anything green? " + areAnyGreen3 + "\n");


            System.out.println("noneMatch");
            boolean isNothingGreen = oneColourManyTimes.stream()
                    .noneMatch(p -> p.equals("green"));
            System.out.println("Is nothing green? " + isNothingGreen);

            boolean isNothingGreen2 = manyColoursOnceEach.stream()
                    .noneMatch(p -> p.equals("green"));
            System.out.println("Is nothing green? " + isNothingGreen2);

            boolean isNothingGreen3 = manyColoursButNotGreen.stream()
                    .noneMatch(p -> p.equals("green"));
            System.out.println("Is nothing green? " + isNothingGreen3);





//            boolean anyGreen = oneColourManyTimes.stream()
//                    .anyMatch(p -> p.equals("green"));
//            System.out.println("Is there any green? " + anyGreen);


        }




    }

