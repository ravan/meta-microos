SUMMARY = "Python wrapper for the ssdeep library"
DESCRIPTION = "A Python wrapper for ssdeep, which is a library for computing context triggered piecewise hashes (CTPH). Also called fuzzy hashes, CTPH can match inputs that have homologies. Such inputs \
have sequences of identical bytes in the same order, although bytes in between these sequences may be different in both \
content and length."
LICENSE = "LGPL-3.0-or-later"

PV = "3.4.1"

RPM_NAME = "python313-ssdeep-3.4.1-2.12.aarch64.rpm"
RPM_HASH = "7396e00dbc6b3ad580927b6cfc5f3f9af0a2dbaac87db06e4e90462e12e937450065865474735f09c24cf03ae7190d71de24b6eb84200f5a46418ef3845e9fbb"

RPROVIDES:${PN} += "python3-ssdeep \
python3.13dist-ssdeep \
python313-ssdeep \
python3dist-ssdeep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuzzy.so.2 \
python-abi \
python313-cffi \
ssdeep"

inherit rpm
