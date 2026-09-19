SUMMARY = "Headers required when building programs against cfitsio library"
DESCRIPTION = "This package contains headers required when building programs against cfitsio \
library."
LICENSE = "NASA-1.3"

PV = "4.7.0"

RPM_NAME = "cfitsio-devel-4.7.0-1.1.aarch64.rpm"
RPM_HASH = "0673b703c029b50cc87dcced294d05fdbb18aa0e9e7875e68dd1896f4edd4db3b76398b608ec145c08b5c86dc38e48131c11e6b32f27abe25f312db90a8c8a61"

RPROVIDES:${PN} += "cfitsio-devel \
cmake-cfitsio \
pkgconfig-cfitsio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libcfitsio10"

inherit rpm
