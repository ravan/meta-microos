SUMMARY = "Vector Graphics Library with Cross-Device Output Support"
DESCRIPTION = "Cairo is a vector graphics library with cross-device output support. \
Currently supported output targets include the X Window System, \
in-memory image buffers, and PostScript. Cairo is designed to produce \
identical output on all output media while taking advantage of display \
hardware acceleration when available. \
 \
This library contains GType declarations for Cairo types. It is also \
meant to support gobject-introspection binding creation."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.18.4"

RPM_NAME = "libcairo-gobject2-1.18.4-4.5.aarch64.rpm"
RPM_HASH = "b0855cfeb27db0f8a5e1159978ba07a3f12d43ec0e78db30a7ab230c6ac3f40c3499679708644c8f029b9105faa893feb5ef132c3c3a4117117cdf02e42f8ce0"

RPROVIDES:${PN} += "libcairo-gobject.so.2 \
libcairo-gobject2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
