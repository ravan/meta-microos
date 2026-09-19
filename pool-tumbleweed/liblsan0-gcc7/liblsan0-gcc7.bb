SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "liblsan0-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "aabe64955dce173433d51641ab4656ac966ba3d9cf6f3adbdb3a4976c7690bab05cf1c1a8720d37eff598509b0cbf776535459f28a6085c0c7688cdad11be14c"

RPROVIDES:${PN} += "liblsan.so.0 \
liblsan0 \
liblsan0-gcc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
