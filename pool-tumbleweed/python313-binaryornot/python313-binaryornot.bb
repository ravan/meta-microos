SUMMARY = "Python package to check if a file is binary or text"
DESCRIPTION = "Pure Python package to guess whether a file is binary or text. \
It uses three layers of detection: \
1. Extension check: Recognizes 131 file types by name for instant classification. \
2. File signatures: Checks headers against known magic-byte signatures. \
3. Content analysis: Uses a trained decision tree for statistical classification."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python313-binaryornot-0.6.0-1.3.noarch.rpm"
RPM_HASH = "ae15e666148ff28bcc66ca8afb5a77f3d935d72c21f9ba887a2520285fac025faa58ae6f9ffe34e676fd5b85c6089af81926503aa37811e0a825dcf58262dba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-binaryornot \
python3.13dist-binaryornot \
python313-binaryornot \
python3dist-binaryornot"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
