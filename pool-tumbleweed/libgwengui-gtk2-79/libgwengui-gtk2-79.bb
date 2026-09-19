SUMMARY = "GTK+ 2 UI backend for Gwenhywfar"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication). \
 \
This package provides the GTK+ 2 implementation of the generic UI toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "libgwengui-gtk2-79-5.14.1-1.3.aarch64.rpm"
RPM_HASH = "451d22e6432fd366068e05cd325232aa075647718f21d013e4ecf4d2a115700cd7cd6464a9cdda2a78ee3cfcfa2054650119672d705e8314a4b0e5179cee9900"

RPROVIDES:${PN} += "libgwengui-gtk2-79 \
libgwengui-gtk2.so.79"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libgwenhywfar.so.79"

inherit rpm
