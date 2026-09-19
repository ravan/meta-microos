SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "14.4.0+git12698"

RPM_NAME = "liblsan0-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "0e50fcc221bb4a6847a71e7f712e0359bc3b9df18b2208f77488468a96f1e19d7f324c2898d6366136586c108cb2d3ba9f47e8ad298185029cf95ac6780098df"

RPROVIDES:${PN} += "liblsan.so.0 \
liblsan0 \
liblsan0-gcc14"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
