SUMMARY = "Python unicodedata backport/updates"
DESCRIPTION = "Unicodedata backport and updates for the latest unicode version. \
The versions of this package match Unicode versions, so \
unicodedata2==16.0.0 is data from Unicode 16.0.0."
LICENSE = "Apache-2.0 & Python-2.0"

PV = "16.0.0"

RPM_NAME = "python313-unicodedata2-16.0.0-2.7.aarch64.rpm"
RPM_HASH = "8b24f02cae9d5bb7273f7833fbfcb7d35a690a630e5427b7028a66b6b52e896f4306f4a72d9d036d654ca36f755bc32b2224b3af795b1e5654d6b4d9ba5e8bf8"

RPROVIDES:${PN} += "python3-unicodedata2 \
python3.13dist-unicodedata2 \
python313-unicodedata2 \
python3dist-unicodedata2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
