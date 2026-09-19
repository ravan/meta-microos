SUMMARY = "The GNU Compiler Hardware-assisted Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=hwaddress option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "14.4.0+git12698"

RPM_NAME = "libhwasan0-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "4ff3ef5bb079074f3ebbf33d5dc34f554b7908558e71fb48faf012d94cec994818dd51f006a46a387fb8e631f8298471cc300ef0f7159d56f2d466c2a8ce7643"

RPROVIDES:${PN} += "libhwasan.so.0 \
libhwasan0 \
libhwasan0-gcc14"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
