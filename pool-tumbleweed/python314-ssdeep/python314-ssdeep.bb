SUMMARY = "Python wrapper for the ssdeep library"
DESCRIPTION = "A Python wrapper for ssdeep, which is a library for computing context triggered piecewise hashes (CTPH). Also called fuzzy hashes, CTPH can match inputs that have homologies. Such inputs \
have sequences of identical bytes in the same order, although bytes in between these sequences may be different in both \
content and length."
LICENSE = "LGPL-3.0-or-later"

PV = "3.4.1"

RPM_NAME = "python314-ssdeep-3.4.1-2.12.aarch64.rpm"
RPM_HASH = "a40f4603d5fc7309c3d9ff473c812092ea01d67c6530bd10338ea2169ab3c27fe9b2d7c783a8311625d435ac4ec8942a7a56141698e57a44120ea1f3ca1282ab"

RPROVIDES:${PN} += "python3.14dist-ssdeep \
python314-ssdeep \
python3dist-ssdeep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuzzy.so.2 \
python-abi \
python314-cffi \
ssdeep"

inherit rpm
