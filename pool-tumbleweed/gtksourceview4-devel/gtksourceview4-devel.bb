SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8.4"

RPM_NAME = "gtksourceview4-devel-4.8.4-3.1.aarch64.rpm"
RPM_HASH = "e2984e148a3985d4797724cc233ab1c6094dc7c0a3a27deac068e8670e5c7c34363e181d716a6af5696d6387b16acbfb8bfea17f7d0b05bfe85d5f8fbd421abc"

RPROVIDES:${PN} += "gtksourceview4-devel \
pkgconfig-gtksourceview-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtksourceview-4-0 \
libgtksourceview4 \
pkgconfig-fribidi \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GtkSource-4"

inherit rpm
