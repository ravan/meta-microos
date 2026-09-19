SUMMARY = "LSC Algorithm Library Applications"
DESCRIPTION = "The LSC Algorithm Library Applications for gravitational wave data analysis. \
This package contains applications that are built on tools in the LSC \
Algorithm Library."
LICENSE = "GPL-2.0-or-later"

PV = "10.1.0"

RPM_NAME = "lalapps-10.1.0-1.4.aarch64.rpm"
RPM_HASH = "c6ff328b8a9580befb3338c601452b3da8ddf130241312819c33f57df1f2304944ce2bc6f6a8a2f7349cbd373b5f79cc35e74f5b4c65617549d820c2921fe567"

RPROVIDES:${PN} += "config-lalapps \
lalapps"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libframel.so.8 \
libgsl.so.28 \
liblal.so.20 \
liblalburst.so.8 \
liblalframe.so.14 \
liblalinference.so.23 \
liblalinspiral.so.18 \
liblalmetaio.so.11 \
liblalpulsar.so.30 \
liblalsimulation.so.37 \
liblalsupport.so.14 \
libm.so.6 \
libmetaio.so.1 \
python3-lalapps"

inherit rpm
