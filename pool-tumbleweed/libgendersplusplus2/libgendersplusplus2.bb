SUMMARY = "C++ library API for genders"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with genders. This is the C++ API."
LICENSE = "GPL-2.0-or-later"

PV = "1.32"

RPM_NAME = "libgendersplusplus2-1.32-1.10.aarch64.rpm"
RPM_HASH = "a5ad5c375db7b8929f48c1e63056d3157ac2677a600918c35cc1cd9794216cd8b3cbb173a0bb86abe14c214358eb7f500687d6a6eccd194b5256bed0126d6fc7"

RPROVIDES:${PN} += "libgendersplusplus.so.2 \
libgendersplusplus2"

RDEPENDS:${PN} += "/sbin/ldconfig \
genders-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgenders.so.0 \
libstdc++.so.6"

inherit rpm
