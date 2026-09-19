SUMMARY = "OpenGL Extension to GTK"
DESCRIPTION = "GtkGLExt is an OpenGL extension to GTK. It provides the GDK objects \
that support OpenGL rendering in GTK and GtkWidget API add-ons, to make \
GTK+ widgets OpenGL-capable."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0git20110529"

RPM_NAME = "libgtkglext-x11-1_0-0-1.2.0git20110529-8.12.aarch64.rpm"
RPM_HASH = "80440789322d7534a552f47138eddc7b8fd4253bc6651d457ad425ecaf262f1566d10adcc29d8c288967ce377a2a733043a7cd0105b568e6e625e7d2e45600d0"

RPROVIDES:${PN} += "gtkglext \
libgdkglext-x11-1.0.so.0 \
libgtkglext-x11-1-0-0 \
libgtkglext-x11-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
