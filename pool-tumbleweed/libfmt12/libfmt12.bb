SUMMARY = "A formatting library for C++"
DESCRIPTION = "Shared library for fmt, a formatting library for C++."
LICENSE = "MIT"

PV = "12.1.0"

RPM_NAME = "libfmt12-12.1.0-1.4.aarch64.rpm"
RPM_HASH = "577226f78fcd42df7b7620b70cce9a6244df241bb7b1c8d603367624bbfe51d1d511bcf1bcd1a5c2dfb6e26cb161c857ff851c500e242b5c23aaa88c8f57423c"

RPROVIDES:${PN} += "libfmt.so.12 \
libfmt12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
