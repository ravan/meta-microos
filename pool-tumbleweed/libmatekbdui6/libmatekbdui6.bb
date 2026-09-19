SUMMARY = "MATE Desktop keyboard configuration shared libraries"
DESCRIPTION = "This package provides libmatekdbui, an API to manage the keyboard in \
MATE Desktop applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "libmatekbdui6-1.28.0-2.5.aarch64.rpm"
RPM_HASH = "ffed6a74785d90385736880639b7404d9cb2e704f4f2d5cc0ed5606706a578292fde67fcb3edbdab44739f3cd3526ff857430a2280af95d9740bfb62a78b0e82"

RPROVIDES:${PN} += "libmatekbd \
libmatekbdui.so.6 \
libmatekbdui6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmatekbd.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxklavier.so.16 \
matekbd-common"

inherit rpm
