SUMMARY = "LSC Algorithm Pulsar Library"
DESCRIPTION = "The LSC Algorithm Pulsar Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "7.1.1"

RPM_NAME = "python313-lalpulsar-7.1.1-2.1.aarch64.rpm"
RPM_HASH = "6eff737b5870c70b546c7d162829884bf3ed3deb5235d3d965290408253a713cc40ddc3286acd55cb33f04813652524a08989f43e73718bcd8ec852057b35668"

RPROVIDES:${PN} += "python3-lalpulsar \
python313-lalpulsar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
liblal.so.20 \
liblalpulsar.so.30 \
liblalsupport.so.14 \
python-abi \
python313-lal \
python313-lalframe \
python313-lalinference \
python313-lalsimulation \
python313-numpy"

inherit rpm
