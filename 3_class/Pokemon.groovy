import groovy.transform.ToString

@ToString
class Pokemon{

    Integer dexNumber
    String name
    String type1
    String type2

    void showTypes(){

        println "$name types are: $type1 and $type2"

    }

}