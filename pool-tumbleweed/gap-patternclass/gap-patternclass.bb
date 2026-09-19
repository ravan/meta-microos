SUMMARY = "GAP: Permutation pattern class"
DESCRIPTION = "The PatternClass package is built on the idea of token passing \
networks building permutation pattern classes. Those classes are best \
determined by their basis. Both sets can be encoded by rank encoding \
their permutations. Each, the class and its basis, in their encoded \
form build a rational language. Rational languages can be computed by \
using automata, which also can be build directly from the token \
passing networks. Both ways will build the same language, i.e. the \
same automaton."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.5"

RPM_NAME = "gap-patternclass-2.4.5-1.6.noarch.rpm"
RPM_HASH = "24350f3c405921a292bc87dde2eb43e70a955cbf2e94949e59b633036e01814beaf7f7d592575c54dd2138a520633c9af1059854a15383d1fed7d5ba6c5dccc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-patternclass"

RDEPENDS:${PN} += "gap-automata \
gap-core \
gap-gapdoc"

inherit rpm
