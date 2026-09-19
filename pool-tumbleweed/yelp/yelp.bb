SUMMARY = "Help Browser for the GNOME Desktop"
DESCRIPTION = "Yelp is the help viewer in GNOME (it's what happens when you press F1). With \
gnome-doc-utils, Yelp serves as a DocBook viewer, a man page viewer and an \
info page viewer."
LICENSE = "GPL-2.0-or-later"

PV = "49.2"

RPM_NAME = "yelp-49.2-1.1.aarch64.rpm"
RPM_HASH = "4e65da41860d9ee2501727fdd52aa97a672680238f0c027703f90f7cd18544ed74dd1ce754265a6224deba4814c85d604abf5cdb5d39eea84c7a8240790a5358"

RPROVIDES:${PN} += "libyelpwebprocessextension.so \
suse-help-viewer \
yelp"

RDEPENDS:${PN} += "docbook-4 \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjavascriptcoregtk-6.0.so.1 \
libwebkitgtk-6.0.so.4 \
libyelp-1.so.0 \
yelp-xsl"

inherit rpm
