SUMMARY = "MATE Desktop graphics viewer"
DESCRIPTION = "The Eye of MATE is a graphics viewer for the MATE Desktop \
which uses the gdk-pixbuf library. It can deal with large images, \
and zoom and scroll with constant memory usage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.1"

RPM_NAME = "eom-1.28.1-1.3.aarch64.rpm"
RPM_HASH = "b1f3fcda69b74ce39bc58fe4653542f4b271a7a565774dec6b7a16c6a6808666cfcb9d9ce9b67f0d2a4f7ce7c3209c1ea5eb5a7e8a19393b9652b71ac8c07bb3"

RPROVIDES:${PN} += "eom \
libfullscreen.so \
libreload.so \
libstatusbar-date.so \
mate-image-viewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libexempi.so.8 \
libexif.so.12 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libmate-desktop-2.so.17 \
libpeas-1.0.so.1 \
libpeas-gtk-1.0.so.1 \
librsvg-2.so.2 \
libxml2.so.16 \
libz.so.1 \
mate-desktop-gsettings-schemas"

inherit rpm
