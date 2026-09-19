SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "5.20.0"

RPM_NAME = "libgtksourceview-5-0-5.20.0-2.1.aarch64.rpm"
RPM_HASH = "fe9d16f9f20624696c33d4bd71df1364419aafd4559350b770bd7ff0215da056eec67ece9bbf69953f66d673ff051f7faddf46700307ca3c640b1fad21b3662c"

RPROVIDES:${PN} += "gtksourceview5 \
libgtksourceview-5-0 \
libgtksourceview-5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpcre2-8.so.0 \
libxml2.so.16"

inherit rpm
