SUMMARY = "Development files for the Atlas protocol C++ implementation"
DESCRIPTION = "This library implements the Atlas protocol for use in client-server \
game applications. It is the standard implementation used by games written \
by the WorldForge project. This library is suitable for linking to either \
clients or servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "0.6.4"

RPM_NAME = "atlascpp-devel-0.6.4-3.4.aarch64.rpm"
RPM_HASH = "f0ccaca43e3f6f20a5f3bf1ac27e3a207cda7d893dd819c02d3a2477551b555d1ecbd6f9cb23f28e3d5436de0a92615a26f568f6b0dceadcff781a1f146b351c"

RPROVIDES:${PN} += "atlascpp-devel \
pkgconfig-atlascpp-0.6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libAtlas-0.6.so.3 \
libAtlasCodecs-0.6.so.3 \
libAtlasMessage-0.6.so.3 \
libatlascpp-0-6-3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
