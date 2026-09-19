SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "15.3.0+git11272"

RPM_NAME = "libtsan2-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "e4761a3ae2256a0ca45b46edf3bf8a469b8438ab3d1bbf009e2d650b3cf289482b655e9227412218a79e1ff5f239c16056e6cb5abb832aee173a8b1f11eb343e"

RPROVIDES:${PN} += "libtsan.so.2 \
libtsan2 \
libtsan2-gcc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
