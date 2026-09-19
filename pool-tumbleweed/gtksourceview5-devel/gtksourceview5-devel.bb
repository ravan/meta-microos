SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "5.20.0"

RPM_NAME = "gtksourceview5-devel-5.20.0-2.1.aarch64.rpm"
RPM_HASH = "d0e25de412761b89d9508c4ad014d86580930ffdf93c5309a0c9487431a131039ab803f6dc159f4a8b547e42f9e7070c8a88f8628fa9d5713342e5d8df1a9d19"

RPROVIDES:${PN} += "gtksourceview5-devel \
pkgconfig-gtksourceview-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtksourceview-5-0 \
pkgconfig-fontconfig \
pkgconfig-fribidi \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk4 \
pkgconfig-libpcre2-8 \
pkgconfig-libxml-2.0 \
pkgconfig-pangoft2 \
typelib-1-0-GtkSource-5"

inherit rpm
