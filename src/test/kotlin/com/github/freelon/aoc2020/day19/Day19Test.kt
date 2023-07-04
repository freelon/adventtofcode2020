package com.github.freelon.aoc2020.day19

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day19Test {
    @Test
    fun part1() {
        val input = """0: 4 1 5
1: 2 3 | 3 2
2: 4 4 | 5 5
3: 4 5 | 5 4
4: "a"
5: "b"

ababbb
bababa
abbbab
aaabbb
aaaabbb
"""

        assertEquals(true, Solver(input).matches("ababbb"))
        assertEquals(false, Solver(input).matches("bababa"))
        assertEquals(true, Solver(input).matches("abbbab"))
        assertEquals(false, Solver(input).matches("aaabbb"))
        assertEquals(false, Solver(input).matches("aaaabbb"))

        assertEquals(2, Day19().partOne(input))
    }

    @Test
    fun part2() {
        val input = """42: 9 14 | 10 1
9: 14 27 | 1 26
10: 23 14 | 28 1
1: "a"
11: 42 31
5: 1 14 | 15 1
19: 14 1 | 14 14
12: 24 14 | 19 1
16: 15 1 | 14 14
31: 14 17 | 1 13
6: 14 14 | 1 14
2: 1 24 | 14 4
0: 8 11
13: 14 3 | 1 12
15: 1 | 14
17: 14 2 | 1 7
23: 25 1 | 22 14
28: 16 1
4: 1 1
20: 14 14 | 1 15
3: 5 14 | 16 1
27: 1 6 | 14 18
14: "b"
21: 14 1 | 1 14
25: 1 1 | 1 14
22: 14 14
8: 42
26: 14 22 | 1 20
18: 15 15
7: 14 5 | 1 21
24: 14 1

abbbbbabbbaaaababbaabbbbabababbbabbbbbbabaaaa
bbabbbbaabaabba
babbbbaabbbbbabbbbbbaabaaabaaa
aaabbbbbbaaaabaababaabababbabaaabbababababaaa
bbbbbbbaaaabbbbaaabbabaaa
bbbababbbbaaaaaaaabbababaaababaabab
ababaaaaaabaaab
ababaaaaabbbaba
baabbaaaabbaaaababbaababb
abbbbabbbbaaaababbbbbbaaaababb
aaaaabbaabaaaaababaa
aaaabbaaaabbaaa
aaaabbaabbaaaaaaabbbabbbaaabbaabaaa
babaaabbbaaabaababbaabababaaab
aabbbbbaabbbaaaaaabbbbbababaaaaabbaaabba"""

        assertTrue(Solver(input).matchesFunky("bbabbbbaabaabba"))
        assertTrue(Solver(input).matchesFunky("babbbbaabbbbbabbbbbbaabaaabaaa"))
        assertTrue(Solver(input).matchesFunky("aaabbbbbbaaaabaababaabababbabaaabbababababaaa"))
        assertTrue(Solver(input).matchesFunky("bbbbbbbaaaabbbbaaabbabaaa"))
        assertTrue(Solver(input).matchesFunky("bbbababbbbaaaaaaaabbababaaababaabab"))
        assertTrue(Solver(input).matchesFunky("ababaaaaaabaaab"))
        assertTrue(Solver(input).matchesFunky("ababaaaaabbbaba"))
        assertTrue(Solver(input).matchesFunky("baabbaaaabbaaaababbaababb"))
        assertTrue(Solver(input).matchesFunky("abbbbabbbbaaaababbbbbbaaaababb"))
        assertTrue(Solver(input).matchesFunky("aaaaabbaabaaaaababaa"))
        assertTrue(Solver(input).matchesFunky("aaaabbaabbaaaaaaabbbabbbaaabbaabaaa"))
        assertTrue(Solver(input).matchesFunky("aabbbbbaabbbaaaaaabbbbbababaaaaabbaaabba"))
        assertFalse(Solver(input).matchesFunky("abbbbbabbbaaaababbaabbbbabababbbabbbbbbabaaaa"))
        assertFalse(Solver(input).matchesFunky("aaaabbaaaabbaaa"))
        assertFalse(Solver(input).matchesFunky("babaaabbbaaabaababbaabababaaab"))

        assertEquals(12, Day19().partTwo(input))
    }
}