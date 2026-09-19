SUMMARY = "Lazarus Component Library"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package contains the common parts of the Lazarus Component Library."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "4.8"

RPM_NAME = "lazarus-lcl-4.8-1.2.aarch64.rpm"
RPM_HASH = "62b6f533b66c56efee4ce603c55197ca01adedb3478b30f2411a5d69e1ac8146da4a77cf8443cecdc04ba5ff8176cc2255f2e0cc871fd96baf33c1ec1dfefdfe"

RPROVIDES:${PN} += "lazarus-lcl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
