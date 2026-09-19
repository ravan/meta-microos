SUMMARY = "Colour Management System Libraries"
DESCRIPTION = "SampleICC is a C++ library for reading, writing, manipulating, and \
applying ICC profiles along with applications that make use of this \
library."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "libSampleICC2-1.6.8-4.20.aarch64.rpm"
RPM_HASH = "3900dbaf444b8625bada8d64b838366549839e8c52416031c51426661809277c6d81cbc093a2207ea878976d51b47b228f762e49840780370191f7abcfbaaa82"

RPROVIDES:${PN} += "libICC-utils.so.2 \
libSampleICC.so.2 \
libSampleICC2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
