SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8.4"

RPM_NAME = "libgtksourceview-4-0-4.8.4-3.1.aarch64.rpm"
RPM_HASH = "c0f1da0154261d46693afc2b0fc2f7ca51b5ab08e3cfd9913203587e644ab90994322ad4817c2f4c3d533062de6dc699ab265b67bcba28b205c29f01ff522300"

RPROVIDES:${PN} += "gtksourceview4 \
libgtksourceview-4-0 \
libgtksourceview-4.so.0 \
libgtksourceview4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfribidi.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.16"

inherit rpm
