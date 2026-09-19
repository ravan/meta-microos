SUMMARY = "File browser for Cinnamon"
DESCRIPTION = "Nemo is the file manager for the Cinnamon desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "6.6.4"

RPM_NAME = "nemo-6.6.4-1.1.aarch64.rpm"
RPM_HASH = "1bf306791b6bf611a884c62d8ef4cc874aa525d23dc0fa70b4464298baf88a06f0ed5e7b1a35692120b2c7f5942497490b39518577bc8e56597bf74c3c63f413"

RPROVIDES:${PN} += "nemo"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
desktop-file-utils \
glib2-tools \
gvfs \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcinnamon-desktop.so.4 \
libexempi.so.8 \
libexif.so.12 \
libgailutil-3.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libnemo-extension.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libselinux.so.1 \
libtinysparql-3.0.so.0 \
libxapp.so.1 \
python3 \
shared-mime-info \
typelib-GLib \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-XApp \
typelib-Xmlb"

inherit rpm
