SUMMARY = "Qt 6 Core 5 Compat library"
DESCRIPTION = "The Qt 6 Core 5 Compat library"
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Core5Compat6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "584c851ea8d44b3198e5c9d4853a7b8aa432a04b245ed85037e13901f5f4e3b7d9dc0fbe2994d6407307f1fa4fd1cf694ba343b78fd0393cf5c07e63b68af99c"

RPROVIDES:${PN} += "libQt6Core5Compat.so.6 \
libQt6Core5Compat6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libicuuc.so.78 \
libstdc++.so.6"

inherit rpm
