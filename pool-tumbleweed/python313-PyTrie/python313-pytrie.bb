SUMMARY = "A pure Python implementation of the trie data structure"
DESCRIPTION = "pytrie is a pure Python 3 implementation of the trie data structure. \
 \
A trie is an ordered tree data structure that is used to store a mapping \
where the keys are sequences, usually strings over an alphabet. In addition to \
implementing the mapping interface, tries allow finding the items for a given \
prefix, and vice versa, finding the items whose keys are prefixes of a given key."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python313-PyTrie-0.4.0-3.2.noarch.rpm"
RPM_HASH = "8f41bcf678f5b00a07599a0dc62bad9f2baf257ddf3d2e2c375e4a1e393176ffc324dc69140393cb54eb41ee473f91ea4a32f093ac704c3b4a08b39aa1f49c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyTrie \
python3-pytrie \
python3.13dist-pytrie \
python313-PyTrie \
python313-pytrie \
python3dist-pytrie"

RDEPENDS:${PN} += "python-abi \
python313-sortedcontainers"

inherit rpm
