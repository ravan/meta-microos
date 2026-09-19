SUMMARY = "The development libraries and header files for WordNet"
DESCRIPTION = "WordNet is a large lexical database of English. \
Nouns, verbs, adjectives and adverbs are grouped into sets \
of cognitive synonyms (synsets), each expressing a distinct concept. Synsets \
are interlinked by means of conceptual-semantic and lexical relations. The \
resulting network of meaningfully related words and concepts can be navigated \
with the browser. \
WordNet's structure makes it a useful tool for computational linguistics and \
natural language processing. \
 \
This package contains the libraries and header files required to create \
applications based on WordNet."
LICENSE = "MIT"

PV = "3.0"

RPM_NAME = "wordnet-devel-3.0-35.11.aarch64.rpm"
RPM_HASH = "f6aff988be95f86c57285c7868264ef7582d066211173db0ec87726c6b524793d07fc31e16372e45faf17348f1657a52d1367454596cd0061e16b150cb662853"

RPROVIDES:${PN} += "wordnet-devel"

RDEPENDS:${PN} += "libWN3 \
tcl-devel \
tk-devel"

inherit rpm
