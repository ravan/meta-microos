SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.5.0+git10516"

RPM_NAME = "libubsan1-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "99f8b074088b57ed24ed8c4d7a4f2efc37b3d2b4f9e842e221349114855309f0dee5d0da98eb37174bdd846dcb84f5494a443a5758b98b1fbe7393f71b81231a"

RPROVIDES:${PN} += "libubsan.so.1 \
libubsan1 \
libubsan1-gcc13"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
