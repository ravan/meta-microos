SUMMARY = "LSC Algorithm Pulsar Library"
DESCRIPTION = "The LSC Algorithm Pulsar Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "7.1.1"

RPM_NAME = "python314-lalpulsar-7.1.1-2.1.aarch64.rpm"
RPM_HASH = "427cc7a342a658e4dbc31844883900cf74ded17cea0d5d371a34335d55821d7a7df0beaa3b9dc0cb2f60d03f87669f154a19625b0864db0ab83c7abf0cc576b4"

RPROVIDES:${PN} += "python314-lalpulsar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
liblal.so.20 \
liblalpulsar.so.30 \
liblalsupport.so.14 \
python-abi \
python314-lal \
python314-lalframe \
python314-lalinference \
python314-lalsimulation \
python314-numpy"

inherit rpm
