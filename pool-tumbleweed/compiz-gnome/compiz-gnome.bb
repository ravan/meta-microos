SUMMARY = "OpenGL window and compositing manager configuration utilities"
DESCRIPTION = "This package contains GNOME/MATE based configuration utilities for \
the Compiz compositing manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-gnome-0.8.18-4.5.aarch64.rpm"
RPM_HASH = "339da3598c80b24a6e47a275955268c53f06b2f4257a94011bc1d59b402f296204359065489045cf15dfb891741f4a0c5b3d8cd8ce42f00ea9cf6529c4930532"

RPROVIDES:${PN} += "compiz-decorator \
compiz-gnome \
compiz-mate"

RDEPENDS:${PN} += "compiz \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXrender.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libdecoration.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmarco-private.so.2 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwnck-3.so.0"

inherit rpm
