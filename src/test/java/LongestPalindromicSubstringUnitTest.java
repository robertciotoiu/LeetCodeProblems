import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class LongestPalindromicSubstringUnitTest {
    LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    public void testEmptyString(){
        Assertions.assertEquals( "", longestPalindromicSubstring.find(""));
    }

    @Test
    public void testOneCharPalindrome(){
        Assertions.assertEquals( "a", longestPalindromicSubstring.find("a"));
    }

    @Test
    public void testEvenLengthPalindrome(){
        Assertions.assertEquals( "aa", longestPalindromicSubstring.find("aa"));
    }

    @Test
    public void testOddLengthPalindrome(){
        Assertions.assertEquals( "aba", longestPalindromicSubstring.find("aba"));
    }

    @Test
    public void testCaseSensitivity(){
        Assertions.assertEquals("a", longestPalindromicSubstring.find("abA"));
    }

    @Test
    public void testEvenLengthSubstringPalindrome(){
        Assertions.assertEquals( "aaaa", longestPalindromicSubstring.find("ddaaaa"));
    }

    @Test
    public void testOddLengthSubstringPalindrome(){
        Assertions.assertEquals( "aba", longestPalindromicSubstring.find("ddaaba"));
    }

    @Test
    public void testEvenLengthSubstringAtBeginningPalindrome(){
        Assertions.assertEquals( "aaaa", longestPalindromicSubstring.find("aaaaddca"));
    }

    @Test
    public void testOddLengthSubstringAtBeginningPalindrome(){
        Assertions.assertEquals( "aba", longestPalindromicSubstring.find("abaddca"));
    }

    @Test
    public void testMultipleSubPalindromesLongestIsFound(){
        Assertions.assertEquals( "aszsdszsa", longestPalindromicSubstring.find("aaacaaaszsdszsacaa"));
    }

    @Test
    @Timeout(value = 200, unit = MILLISECONDS)
    public void testTimeLimit(){

        Assertions.assertEquals("ranynar",longestPalindromicSubstring.find("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }

    @Test
    @Timeout(value = 200, unit = MILLISECONDS)
    public void testTimeLimit2(){
        Assertions.assertEquals("grnrg",longestPalindromicSubstring.find("dtgrtoxuybwyfskikukcqlvprfipgaygawcqnfhpxoifwgpnzjfdnhpgmsoqzlpsaxmeswlhzdxoxobxysgmpkhcylvqlzenzhzhnakctrliyyngrquiuvhpcrnccapuuwrrdufwwungaevzkvwbkcietiqsxpvaaowrteqgkvovcoqumgrlsxvouaqzwaylehybqchsgpzbkfugujrostopwhtgrnrggocprnxwsecmvofawkkpjvcchtxixjtrnngrzqpiwywmnbdnjwqpmnifdiwzpmabosrmzhgdwgcgidmubywsnshcgcrawjvfiuxzyzxsbpfhzpfkjqcpfyynlpshzqectcnltfimkukopjzzmlfkwlgbzftsddnxrjootpdhjehaafudkkffmcnimnfzzjjlggzvqozcumjyazchjkspdlmifvsciqzgcbehqvrwjkusapzzxyiwxlcwpzvdsyqcfnguoidiiekwcjdvbxjvgwgcjcmjwbizhhcgirebhsplioytrgjqwrpwdciaeizxssedsylptffwhnedriqozvfcnsmxmdxdtflwjvrvmyausnzlrgcchmyrgvazjqmvttabnhffoe"));
    }

    @Test
    @Timeout(value = 200, unit = MILLISECONDS)
    public void testTimeLimit3(){

        Assertions.assertEquals("qjkjq",longestPalindromicSubstring.find("uwqrvqslistiezghcxaocjbhtktayupazvowjrgexqobeymperyxtfkchujjkeefmdngfabycqzlslocjqipkszmihaarekosdkwvsirzxpauzqgnftcuflzyqwftwdeizwjhloqwkhevfovqwyvwcrosexhflkcudycvuelvvqlbzxoajisqgwgzhioomucfmkmyaqufqggimzpvggdohgxheielsqucemxrkmmagozxhvxlwvtbbcegkvvdrgkqszgajebbobxnossfrafglxvryhvyfcibfkgpbsorqprfujfgbmbctsenvbzcvypcjubsnjrjvyznbswqawodghmigdwgijfytxbgpxreyevuprpztmjejkaqyhppchuuytkdsteroptkouuvmkvejfunmawyuezxvxlrjulzdikvhgxajohpzrshrnngesarimyopgqydcmsaciegqlpqnclpwcjqmhtmtwwtbkmtnntdllqbyyhfxsjyhugnjbebtxeljytoxvqvrxygmtogndrhlcmbmgiueliyfkkcuypvvzkomjrfhuhhnfbxeuvssvvllgukdolffukzwqaimxkngnjnmsbvwkajyxqntsqjkjqvwxnlxwjfiaofejtjcveqstqhdzgqistxwsgrovvwgorjaoosremqbzllgbgrwtqdggxnyvkivlcvnv"));
    }

    @Test
    @Timeout(value = 200, unit = MILLISECONDS)
    public void testTimeLimit4(){

        Assertions.assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",longestPalindromicSubstring.find("\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\""));
    }

    @Test
    public void testSample1(){
        Assertions.assertEquals( "bab", longestPalindromicSubstring.find("babad"));
    }

    @Test
    public void testSample2(){
        Assertions.assertEquals("bb", longestPalindromicSubstring.find("cbbd"));
    }

    @Test
    public void testSample3(){
        Assertions.assertEquals("aba", longestPalindromicSubstring.find("caba"));
    }

    @Test
    public void testSample4(){
        Assertions.assertEquals("aabaacaabaa", longestPalindromicSubstring.find("aabaacaabaa"));
    }

    @Test
    public void testSample5(){
        Assertions.assertEquals("bcb", longestPalindromicSubstring.find("abcbc"));
    }
}
