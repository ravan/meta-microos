SUMMARY = "The GNU Compiler Hardware-assisted Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=hwaddress option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.5.0+git10516"

RPM_NAME = "libhwasan0-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "1856c13158552fe523bd9e332cdd3f380a613d9b11a238c6c317bda63b1902aa2a35a9e98cea438357060314c88875e383abbc9003f113bd514af26185a9c897"

RPROVIDES:${PN} += "libhwasan.so.0 \
libhwasan0 \
libhwasan0-gcc13"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
