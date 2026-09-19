SUMMARY = "Header files for orcania"
DESCRIPTION = "Development and header files for orcania."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.3"

RPM_NAME = "orcania-devel-2.3.3-2.3.aarch64.rpm"
RPM_HASH = "9a84a71b01f308ef06f1b05fe3325bdcf2571e99b079ac2d7166a0afce4d977237011efbbb3fbaf4fc6ddd05ca0c16b7044b5e9b5d988af39784e55d7b9a9393"

RPROVIDES:${PN} += "cmake-Orcania \
orcania-devel \
pkgconfig-liborcania"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
liborcania.so.2.3 \
liborcania2-3"

inherit rpm
