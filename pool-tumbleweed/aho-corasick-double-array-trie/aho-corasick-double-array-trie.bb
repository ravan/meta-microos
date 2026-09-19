SUMMARY = "Aho Corasick algorithm implementation based on Double Array Trie"
DESCRIPTION = "An extremely fast implementation of Aho Corasick algorithm based on Double Array Trie."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "aho-corasick-double-array-trie-1.2.1-4.7.noarch.rpm"
RPM_HASH = "0e36aaba574906a942b4a6a2b9aa54faf8dfdb59c11122cc9479fc8a17389a4a0d435f7a0b55f4a39944e52f51b626da1263cdca369cac56160fb4db832491cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aho-corasick-double-array-trie \
mvn-com.hankcs-aho-corasick-double-array-trie \
mvn-com.hankcs-aho-corasick-double-array-trie-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
