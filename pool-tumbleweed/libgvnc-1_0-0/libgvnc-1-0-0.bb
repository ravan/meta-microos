SUMMARY = "GObject-based library to interact with the RFB protocol"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package contains the GObject-based library to interact with the \
RFB protocol."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "libgvnc-1_0-0-1.5.0-5.2.aarch64.rpm"
RPM_HASH = "008d1e09166fb8698b35633678260df188d7223dd08520db41d6ab801935822ca5221dafd6fb8c0e5c6112789be161696c2be84d93cb8330f431fc5bdb54515a"

RPROVIDES:${PN} += "libgvnc-1-0-0 \
libgvnc-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libsasl2.so.3 \
libz.so.1"

inherit rpm
