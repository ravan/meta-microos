SUMMARY = "GTK+ 3 UI backend for Gwenhywfar"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication). \
 \
This package provides the GTK+ 3 implementation of the generic UI toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "libgwengui-gtk3-79-5.14.1-1.3.aarch64.rpm"
RPM_HASH = "b516a77f69d4b2ee91fa0025f40926eb96f2dafc2398be15d239bf340a29d7c98770a0fcb7bdedb0ee2e903d9b6209e09f5d0acdf56302c95d32fa94f7f2cbe2"

RPROVIDES:${PN} += "libgwengui-gtk3-79 \
libgwengui-gtk3.so.79"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgwenhywfar.so.79"

inherit rpm
