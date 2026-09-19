SUMMARY = "Python package to check if a file is binary or text"
DESCRIPTION = "Pure Python package to guess whether a file is binary or text. \
It uses three layers of detection: \
1. Extension check: Recognizes 131 file types by name for instant classification. \
2. File signatures: Checks headers against known magic-byte signatures. \
3. Content analysis: Uses a trained decision tree for statistical classification."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python314-binaryornot-0.6.0-1.3.noarch.rpm"
RPM_HASH = "d3863c158551f0c8abd8df1a43b68515484fdd22484dfac25c270c4df32e1088c9e3210efa50cd3d69ed30194d20992d678a9cba3bff076f2ad3bace05707dc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-binaryornot \
python314-binaryornot \
python3dist-binaryornot"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
