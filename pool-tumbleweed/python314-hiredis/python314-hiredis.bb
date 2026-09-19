SUMMARY = "Python wrapper for hiredis"
DESCRIPTION = "Python wrapper for hiredis C connector."
LICENSE = "BSD-3-Clause"

PV = "3.4.1"

RPM_NAME = "python314-hiredis-3.4.1-1.1.aarch64.rpm"
RPM_HASH = "5448485ab0939c0508619c7a2a0e6ed4b13ea4e7d406e83e7de0fe9ef770d9522bc247ea89de089c1c2dabae5f29047db6b1d437570779c99987b904b3178260"

RPROVIDES:${PN} += "python3.14dist-hiredis \
python314-hiredis \
python3dist-hiredis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhiredis.so.1.3.0 \
python-abi"

inherit rpm
