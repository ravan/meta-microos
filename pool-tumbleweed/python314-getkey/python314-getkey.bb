SUMMARY = "Read single characters and key-strokes"
DESCRIPTION = "Read single characters and key-strokes"
LICENSE = "MIT"

PV = "0.6.5"

RPM_NAME = "python314-getkey-0.6.5-1.7.noarch.rpm"
RPM_HASH = "1f11e9b21eae5a297ba095bfc4f8c952d2d8848efb7671776fba5114c6c2bcc7f14378677a160bc0424bf8d8d51c7a10fcd3b3480305742e61cdd09cfe50b2b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-getkey \
python314-getkey \
python3dist-getkey"

RDEPENDS:${PN} += "python-abi"

inherit rpm
