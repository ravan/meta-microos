SUMMARY = "Fast and functional graphics viewer development files"
DESCRIPTION = "xviewer is a simple graphics viewer for the Cinnamon desktop and \
others which uses the gdk-pixbuf library. It can deal with large \
images, and zoom and scroll with constant memory usage. Its goals \
are simplicity and standards compliance."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.4.16"

RPM_NAME = "xviewer-devel-3.4.16-2.3.aarch64.rpm"
RPM_HASH = "9664449baef29a6dd845eb1d36ee71d725c928200602989c377211569a0812a12c60fea3aa7d732ee1355aff0ce5a5958cf0ee2c5cf598503b3b0bf3c9a6ad0e"

RPROVIDES:${PN} += "libxviewer.so \
pkgconfig-xviewer \
xviewer-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcinnamon-desktop.so.4 \
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
libpeas-1.0.so.1 \
libpeas-gtk-1.0.so.1 \
librsvg-2.so.2 \
libxapp.so.1 \
libz.so.1 \
pkgconfig-cinnamon-desktop \
pkgconfig-exempi-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-girepository-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-lcms2 \
pkgconfig-libexif \
pkgconfig-libjpeg \
pkgconfig-libpeas-1.0 \
pkgconfig-libpeas-gtk-1.0 \
pkgconfig-librsvg-2.0 \
pkgconfig-x11 \
pkgconfig-xapp \
pkgconfig-zlib \
typelib-1-0-Xviewer-3-0"

inherit rpm
