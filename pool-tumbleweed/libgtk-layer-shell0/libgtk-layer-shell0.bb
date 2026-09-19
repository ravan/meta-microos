SUMMARY = "Library to create desktop components for Wayland"
DESCRIPTION = "A library to create panels and other desktop components for Wayland using the Layer Shell protocol"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.10.1"

RPM_NAME = "libgtk-layer-shell0-0.10.1-1.4.aarch64.rpm"
RPM_HASH = "5ac4af831e2436b38f241e256dc6b4abac70f1db1559724648c18180154e8a7177e49c8f3f5d276932e7a3af7c48c7e71466c651cea9451c1b3330aa291c36e8"

RPROVIDES:${PN} += "libgtk-layer-shell.so.0 \
libgtk-layer-shell0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwayland-client.so.0"

inherit rpm
