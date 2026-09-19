SUMMARY = "Note editor for GNOME -- Search Provider for GNOME Shell"
DESCRIPTION = "Bijiben is a note editor designed to remain simple to use. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from documents."
LICENSE = "GPL-3.0-or-later"

PV = "40.2+git586.102d7c2f"

RPM_NAME = "gnome-shell-search-provider-bijiben-40.2+git586.102d7c2f-1.3.aarch64.rpm"
RPM_HASH = "80733922f36b5b2fae0f166a151718dfac7ff936178e91ac12a7f70f4c69bb0fff620367e089f7cbab89c55195e275b529769e9e0c1e429615a3f678ac10b8b7"

RPROVIDES:${PN} += "gnome-shell-search-provider-bijiben"

RDEPENDS:${PN} += "bijiben \
gnome-shell \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libtinysparql-3.0.so.0"

inherit rpm
