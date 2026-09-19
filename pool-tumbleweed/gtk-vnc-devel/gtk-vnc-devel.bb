SUMMARY = "A GTK widget for VNC clients -- Development Files"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "gtk-vnc-devel-1.5.0-5.2.aarch64.rpm"
RPM_HASH = "9afa4f3e22cb716ea2b84ec00bad9fdd4fe5e6a94cd13191e8b6c4652f1dfebf5fb20487069f3bc6d58736e174c21aca69561c168126d5c6979220063369a548"

RPROVIDES:${PN} += "gtk-vnc-devel \
pkgconfig-gtk-vnc-2.0 \
pkgconfig-gvnc-1.0 \
pkgconfig-gvncpulse-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtk-vnc-2-0-0 \
libgvnc-1-0-0 \
libgvncpulse-1-0-0 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-gmp \
pkgconfig-gnutls \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gvnc-1.0 \
pkgconfig-libpulse-simple \
pkgconfig-libsasl2 \
pkgconfig-x11 \
pkgconfig-zlib \
typelib-1-0-GVnc-1-0 \
typelib-1-0-GVncPulse-1-0 \
typelib-1-0-GtkVnc-2-0"

inherit rpm
