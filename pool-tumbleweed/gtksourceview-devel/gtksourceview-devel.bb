SUMMARY = "Development files for the GTK+ source editing widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.11"

RPM_NAME = "gtksourceview-devel-3.24.11-6.8.aarch64.rpm"
RPM_HASH = "b84aeac8775e988a7f8fa2739975ffab32dd8145e91155adf634e5b2f78f9973dd1419ac089d1d9423eb205fcb9b3ea3a738e5054a07f0bb09c41f4fecceaa29"

RPROVIDES:${PN} += "gtksourceview-devel \
pkgconfig-gtksourceview-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtksourceview-3-0-1 \
libgtksourceview3 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GtkSource-3-0"

inherit rpm
