SUMMARY = "Auxiliary utilities for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "gtk3-tools-3.24.52+git59.b30343717d-1.1.aarch64.rpm"
RPM_HASH = "255cb648d5b119b743ae399c498898c8753a8da4d0405e134f8d2790d3f23b8bf788f50512dbf5cce13ddc9e2ae9e9d8b0b1ac276938229b5ea91894ad64d2ae"

RPROVIDES:${PN} += "gtk3-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
