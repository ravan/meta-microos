SUMMARY = "A library for doing approximate and phonetic matching of strings"
DESCRIPTION = "Jellyfish is a python library for doing approximate and phonetic \
matching of strings. \
 \
Includes algorithms for string comparison: Levenshtein Distance, \
Damerau-Levenshtein Distance, Jaro Distance, Jaro-Winkler Distance, \
Match Rating Approach Comparison and Hamming Distance. \
 \
And algorithms for phonetic encoding: American Soundex, Metaphone, \
NYSIIS (New York State Identification and Intelligence System) and \
Match Rating Codex."
LICENSE = "BSD-2-Clause"

PV = "1.2.1"

RPM_NAME = "python314-jellyfish-1.2.1-1.8.aarch64.rpm"
RPM_HASH = "73874dcf5b54a6a77281145e721d31ef055cbbb8b3bf8210d14e96f199b70b88a7c1199b996bf309019bbff2bcc2429d957b63a2ce544aa1757e83f8fe8d5a95"

RPROVIDES:${PN} += "python3.14dist-jellyfish \
python314-jellyfish \
python3dist-jellyfish"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
