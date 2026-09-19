SUMMARY = "Javadoc for aho-corasick-double-array-trie"
DESCRIPTION = "This package contains javadoc for aho-corasick-double-array-trie."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "aho-corasick-double-array-trie-javadoc-1.2.1-4.7.noarch.rpm"
RPM_HASH = "4f0849a69e0b569bc83787dd918b765ebff1cd35dacb24e0e3fbb0ddc0bb9bba95968d1b92603bc1148e660804c84e764ab83c6fc02bd07e4367455702a7c3e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aho-corasick-double-array-trie-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
