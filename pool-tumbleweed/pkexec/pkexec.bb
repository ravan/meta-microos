SUMMARY = "Pkexec component of polkit"
DESCRIPTION = "This package contains the pkexec setuid root binary part of polkit."
LICENSE = "LGPL-2.1-or-later"

PV = "127"

RPM_NAME = "pkexec-127-7.2.aarch64.rpm"
RPM_HASH = "e45a43e567aeb78307539ed2204388b3edcc228d36dbf8ea731b3c8d1fb2bf810c6ab244074d6212948c51fc342bdfa656d615f50d67b6be149abf5608e5eb96"

RPROVIDES:${PN} += "pkexec \
pkexec-rpm \
polkit-/usr/bin/pkexec"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpam.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
permissions \
polkit"

inherit rpm
