SUMMARY = "A formatting library for C++"
DESCRIPTION = "Shared library for fmt, a formatting library for C++."
LICENSE = "MIT"

PV = "10.2.1"

RPM_NAME = "libfmt10-10.2.1-1.10.aarch64.rpm"
RPM_HASH = "316a54f3b008b7b6b19227c05dadd0b60c549611908caf6f9ed3f01549f7edc737b5a89e944a819c3d7f25ed286e3fc8bb5b5cf1bdf3f4bee55e009a4d0c2f2f"

RPROVIDES:${PN} += "libfmt.so.10 \
libfmt10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
