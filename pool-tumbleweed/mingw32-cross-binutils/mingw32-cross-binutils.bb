SUMMARY = "GNU Binutils"
DESCRIPTION = "The GNU Binutils are a collection of binary tools. \
These utilities (like 'as', 'ld', 'strip') understand Windows executables and DLLs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.45.1"

RPM_NAME = "mingw32-cross-binutils-2.45.1-3.4.aarch64.rpm"
RPM_HASH = "74e45cc96514985c9b5f00185f2eb9d99c80f3dc7cdfc0f86f9f93473b974aa91762a5f69a29c16c24e9017e47fac077c09153f06875d016a9f85375f3c79e50"

RPROVIDES:${PN} += "libdep.so \
mingw32-cross-binutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfl.so.2 \
libm.so.6 \
mingw32-cross-binutils-utils \
mingw32-filesystem"

inherit rpm
