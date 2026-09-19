SUMMARY = "Pure Python Adb Library"
DESCRIPTION = "Pure Python Adb Library"
LICENSE = "MIT"

PV = "2.12.0"

RPM_NAME = "python314-adbutils-2.12.0-1.1.noarch.rpm"
RPM_HASH = "86af6abe39fb254e65065063ad8c3d1c8609b063e14ed4ff4b726bcee13d7966410fb6d0b5f212aa3ed35f8c0ad533597ed2cb2a5cb972f62018ccfc6eb006a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-adbutils \
python314-adbutils \
python3dist-adbutils"

RDEPENDS:${PN} += "python-abi \
python314-Pillow \
python314-deprecation \
python314-requests \
python314-retry"

inherit rpm
