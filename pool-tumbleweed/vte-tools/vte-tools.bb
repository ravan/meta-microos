SUMMARY = "Tools from the VTE terminal emulator package"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides tools using VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.84.1"

RPM_NAME = "vte-tools-0.84.1-1.2.aarch64.rpm"
RPM_HASH = "f8bc4bf45a70be154910f4597cee3d38a61cc416faffaf26002d1ca5747bd1ceac0d9d74abeede58ffb84e0d90462500b8a993e3f6420a4952f1d6f460e15598"

RPROVIDES:${PN} += "vte-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6 \
libvte-2.91.so.0"

inherit rpm
