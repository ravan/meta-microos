SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.11"

RPM_NAME = "libgtksourceview-3_0-1-3.24.11-6.8.aarch64.rpm"
RPM_HASH = "7b94b1c8f65823a3cbfeecf6e07558218e957dddd114eff4144d093763747f0494e403a56709d2af0e8d5af162557d5b44ea8b706f4878b4450faea734091ae5"

RPROVIDES:${PN} += "gtksourceview \
libgtksourceview-3-0-1 \
libgtksourceview-3.0.so.1 \
libgtksourceview3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
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
