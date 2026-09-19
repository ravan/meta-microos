SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libtsan0-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "b85b2f39ef02d2482276cb2b7d9b785fe5cc242610b99745edc6d5cba4e8262d52ae5d6cf253acb581c54c7934aeff42b185b2154affdb1d45b9c411c67794d9"

RPROVIDES:${PN} += "libtsan.so.0 \
libtsan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
