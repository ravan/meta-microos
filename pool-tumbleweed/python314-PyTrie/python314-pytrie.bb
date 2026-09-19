SUMMARY = "A pure Python implementation of the trie data structure"
DESCRIPTION = "pytrie is a pure Python 3 implementation of the trie data structure. \
 \
A trie is an ordered tree data structure that is used to store a mapping \
where the keys are sequences, usually strings over an alphabet. In addition to \
implementing the mapping interface, tries allow finding the items for a given \
prefix, and vice versa, finding the items whose keys are prefixes of a given key."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python314-PyTrie-0.4.0-3.2.noarch.rpm"
RPM_HASH = "6914d9fa0cfca3ae9930dde1726404dc89f8316c7f93d60319f6d5fe03549ff3302900f52dfb54721da6d4c0e47f8e9ceeebf64ae540ef7701811b79d0c4394d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytrie \
python314-PyTrie \
python314-pytrie \
python3dist-pytrie"

RDEPENDS:${PN} += "python-abi \
python314-sortedcontainers"

inherit rpm
