SUMMARY = "Utilities for packaging support"
DESCRIPTION = "Utilities (like strip and objdump) which are needed for generating package"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.45.1"

RPM_NAME = "mingw64-cross-binutils-utils-2.45.1-3.4.aarch64.rpm"
RPM_HASH = "70142dec5844c1fad0090bf5d7428e9f8595fbd1c6b36b6426973aabb1ddadefe94f3b06dcc12f89edc6e77db83a6d720701e05a693d12f4e244bb6af2a1eaf8"

RPROVIDES:${PN} += "mingw64-cross-binutils-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
