SUMMARY = "C++ API of libconfig"
DESCRIPTION = "libconfig is a library for manipulating structured configuration \
files. The supported file format is more compact and more readable \
than XML. Unlike XML, it is type-aware, so it is not necessary to do \
string parsing in application code. \
 \
This package contains the shared libraries for libconfig."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.1"

RPM_NAME = "libconfig++15-1.8.1-1.7.aarch64.rpm"
RPM_HASH = "cf8e41c6034f7725198c9edcdbbfb90d1a171210706bb5f6bde2fd2105997cdbca18c0545734a6622d235ffcd3eee80f334a9f35caef4ad8fd5ad184d35b4a47"

RPROVIDES:${PN} += "libconfig++.so.15 \
libconfig++15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
