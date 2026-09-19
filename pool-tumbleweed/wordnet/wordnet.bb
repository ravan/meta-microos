SUMMARY = "A lexical database for the English language"
DESCRIPTION = "WordNet is a large lexical database of English. \
Nouns, verbs, adjectives and adverbs are grouped into sets \
of cognitive synonyms (synsets), each expressing a distinct concept. Synsets \
are interlinked by means of conceptual-semantic and lexical relations. The \
resulting network of meaningfully related words and concepts can be navigated \
with the browser. \
WordNet's structure makes it a useful tool for computational linguistics and \
natural language processing."
LICENSE = "MIT"

PV = "3.0"

RPM_NAME = "wordnet-3.0-35.11.aarch64.rpm"
RPM_HASH = "6824c54d3033b573f5e61ead90e43e185a4475398b6ad80b39c92944fa4d57aa60a8446e6f93a98cdde94bae5c4826236507eefe6b8b3619f7b1edddcb44b7c4"

RPROVIDES:${PN} += "wordnet"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libWN.so.3 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
tcl \
tk"

inherit rpm
