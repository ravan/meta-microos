SUMMARY = "Extract, clean, transform, hyphenate and metadata for ISBNs"
DESCRIPTION = "Extract, clean, transform, hyphenate and metadata for ISBNs \
(International Standard Book Number)."
LICENSE = "LGPL-3.0-only"

PV = "3.10.14"

RPM_NAME = "python313-isbnlib-3.10.14-3.1.noarch.rpm"
RPM_HASH = "26d64f3d827ff93b4c3bf7be381dc7449db20bb80f2ea9d29c7ed934171ec4d9b6bf45ce66be55f4a7b4f881853f348a858bd1d39a0b031a71ea89187ae0ef92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-isbnlib \
python3.13dist-isbnlib \
python313-isbnlib \
python3dist-isbnlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
