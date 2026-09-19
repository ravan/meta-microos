SUMMARY = "Image Viewer for GNOME"
DESCRIPTION = "Eye of GNOME (eog) is a simple graphics viewer for the GNOME desktop \
which uses the gdk-pixbuf library. It can deal with large images, and \
zoom and scroll with constant memory usage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "50.3"

RPM_NAME = "eog-50.3-1.1.aarch64.rpm"
RPM_HASH = "b1f5d0ff345be67b4c03c752f1abe75e1392ef3089cf8d6e26cdc3bc891d28ab06e067ce6785a5379666a4200f5f55943d75c5aea2c7c831a27f568db460ce88"

RPROVIDES:${PN} += "eog \
libeog.so \
libfullscreen.so \
libreload.so \
libstatusbar-date.so \
typelib-Eog"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libexempi.so.8 \
libexif.so.12 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpeas-1.0.so.1 \
libpeas-gtk-1.0.so.1 \
librsvg-2.so.2 \
libz.so.1 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
