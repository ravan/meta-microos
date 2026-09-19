SUMMARY = "dict-like structures for Python"
DESCRIPTION = "cooldict provides some dict-like structures for Python, such as \
* a write-through cache around another dict \
* a finalizable dict \
* a branching dict \
* a copy-on-write dict (with and without sinkholing capability)"
LICENSE = "BSD-2-Clause"

PV = "1.04"

RPM_NAME = "python313-cooldict-1.04-2.5.noarch.rpm"
RPM_HASH = "84f76a3de4402bdeafb7637e44203bdad9f1cc9dc1333f25ec9594ae431e93abe9600e5683b2c3afddd725376bf2b837540926579a0f9e8a437558d3d2981778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cooldict \
python3.13dist-cooldict \
python313-cooldict \
python3dist-cooldict"

RDEPENDS:${PN} += "python-abi \
python313-ana"

inherit rpm
