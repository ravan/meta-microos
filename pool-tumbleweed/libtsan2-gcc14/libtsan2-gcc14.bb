SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "14.4.0+git12698"

RPM_NAME = "libtsan2-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "4943849acc616ce8a1a71bd0701a13543c99337fc0937f004cff712a8d66ade9791f18a2810936720614033b5db01505e5c247e3d215f6ebde1d378f6e6bb612"

RPROVIDES:${PN} += "libtsan.so.2 \
libtsan2 \
libtsan2-gcc14"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
