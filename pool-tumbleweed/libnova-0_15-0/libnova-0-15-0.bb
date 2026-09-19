SUMMARY = "Celestial Mechanics, Astrometry and Astrodynamics Library"
DESCRIPTION = "libnova is a general purpose, double precision, Celestial Mechanics, \
Astrometry and Astrodynamics library. The intended audience of libnova \
is C & C++ programmers, astronomers and anyone else interested in \
calculating positions of astronomical objects or celestial mechanics."
LICENSE = "LGPL-2.0+"

PV = "0.15.0"

RPM_NAME = "libnova-0_15-0-0.15.0-11.9.aarch64.rpm"
RPM_HASH = "2c7a149d8caf813ff1f5e650573aa0a3c1307df2b062c9d869021c9a82b4940b617ea4373f90e41ddef1360ff6c3a625373c280ddb00902e642f885f7d5ae7fd"

RPROVIDES:${PN} += "libnova-0-15-0 \
libnova-0.15.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
