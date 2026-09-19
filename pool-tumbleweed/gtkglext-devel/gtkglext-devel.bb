SUMMARY = "OpenGL Extension to GTK"
DESCRIPTION = "GtkGLExt is an OpenGL extension to GTK. It provides the GDK objects \
which support OpenGL rendering in GTK, and GtkWidget API add-ons to \
make GTK+ widgets OpenGL-capable."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0git20110529"

RPM_NAME = "gtkglext-devel-1.2.0git20110529-8.12.aarch64.rpm"
RPM_HASH = "f6178025456efee5afafcec301651e9c43032c2b5652a5cb1ac256976dc7c1c317a4a97c2210b3155a638c38fc071b804664b3f12fe21a43dc2345df04a9ff10"

RPROVIDES:${PN} += "gtkglext-devel \
pkgconfig-gdkglext-1.0 \
pkgconfig-gdkglext-x11-1.0 \
pkgconfig-gtkglext-1.0 \
pkgconfig-gtkglext-x11-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-devel \
libgtkglext-x11-1-0-0 \
pkgconfig-gdk-2.0 \
pkgconfig-gdkglext-x11-1.0 \
pkgconfig-gl \
pkgconfig-gtk+-2.0"

inherit rpm
