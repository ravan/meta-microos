SUMMARY = "Calculate the Levenshtein edit distance between two strings"
DESCRIPTION = "This module implements the Levenshtein edit distance, which measures the \
difference between two strings, in terms of the _edit distance_. This \
distance is the number of substitutions, deletions or insertions ('edits') \
needed to transform one string into the other one (and vice versa). When \
two strings have distance 0, they are the same. \
 \
To learn more about the Levenshtein metric, have a look at the at \
http://en.wikipedia.org/wiki/Levenshtein_distance."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Text-Levenshtein-0.15-1.15.noarch.rpm"
RPM_HASH = "d4da7da7043f213b465f2290ac0b568019e57181ae6cb47f18b04a674c6434789fd12344b3b8c9719c5ae42cb3872a44f0db47294d0650f758118d5a25e492db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Levenshtein \
perl-Text-Levenshtein"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Unicode--Collate"

inherit rpm
