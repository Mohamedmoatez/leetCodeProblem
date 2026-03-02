package Easy;

public class vaildPhoneNumber {


//    grep -E '^(\([0-9]{3}\) [0-9]{3}-[0-9]{4}|[0-9]{3}-[0-9]{3}-[0-9]{4})$' file.txt



   /*
   grep -E uses extended regular expressions

    The pattern matches either:

 \([0-9]{3}\) [0-9]{3}-[0-9]{4} - format: (xxx) xxx-xxxx

[0-9]{3}-[0-9]{3}-[0-9]{4} - format: xxx-xxx-xxxx


^ and $ anchors ensure the entire line matches the pattern (no extra characters)

            [0-9]{3} matches exactly 3 digits

    The | acts as an OR operator between the two formats */

}
