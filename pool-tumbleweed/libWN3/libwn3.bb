SUMMARY = "Shared library for wordnet"
DESCRIPTION = "WordNet is a large lexical database of English. \
Nouns, verbs, adjectives and adverbs are grouped into sets \
of cognitive synonyms (synsets), each expressing a distinct concept. Synsets \
are interlinked by means of conceptual-semantic and lexical relations. The \
resulting network of meaningfully related words and concepts can be navigated \
with the browser. \
WordNet's structure makes it a useful tool for computational linguistics and \
natural language processing. \
 \
This package contains shared library for wordnet."
LICENSE = "MIT"

PV = "3.0"

RPM_NAME = "libWN3-3.0-35.11.aarch64.rpm"
RPM_HASH = "9bac7c12dca9f9fdcbdb14eb9ad2b73eb2e34d68d29045ffbf2467e0e83b3f0595f67a7a02801efff5eb2590eb6ffbfc30d7015cea4d682070ab701e85840b32"

RPROVIDES:${PN} += "libWN.so.3 \
libWN3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
