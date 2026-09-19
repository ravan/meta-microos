SUMMARY = "Theme rendering library for the MATE Desktop Window Manager"
DESCRIPTION = "Metacity is a window manager using GTK to do everything. \
It is developed mainly for the MATE and GNOME Flashback desktops. \
 \
This package contains a library to render themes."
LICENSE = "GPL-2.0-or-later"

PV = "3.56.0"

RPM_NAME = "libmetacity3-3.56.0-1.6.aarch64.rpm"
RPM_HASH = "c4352bcf5fc749b7a80006170970c9c85e86d88360a8d08874466e7f2adb7879031aa94e4ed09f8077f8e2eefcb4dcc70f08922e873a43f509a27db58cb89bed"

RPROVIDES:${PN} += "libmetacity.so.3 \
libmetacity3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
