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

RPM_NAME = "python313-jellyfish-1.2.1-1.8.aarch64.rpm"
RPM_HASH = "3b0fb8487444143766ea0d0074fe140cb3f84d70e1e1c4279a05cf4dc5d438be050e38872895d7959ff39efa56677adff7aa54c4504b9cdb479f13c2750f7328"

RPROVIDES:${PN} += "python3-jellyfish \
python3.13dist-jellyfish \
python313-jellyfish \
python3dist-jellyfish"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
