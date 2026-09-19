SUMMARY = "Core library for the GNOME Desktop help browser"
DESCRIPTION = "Yelp is the help viewer in GNOME (it's what happens when you press F1). With \
gnome-doc-utils, Yelp serves as a DocBook viewer, a man page viewer and an \
info page viewer. \
 \
This package provides Yelp's system shared libraries."
LICENSE = "GPL-2.0-or-later"

PV = "49.2"

RPM_NAME = "libyelp-1-0-49.2-1.1.aarch64.rpm"
RPM_HASH = "453393fa04c5223a537415c6424ffcf353a10ed7c387057f68642912d2761f8d1806300ac87acc6e7d3bbc5a5571c9bd525a2b48c0fd07423b64f9728a5ebdb4"

RPROVIDES:${PN} += "libyelp-1-0 \
libyelp-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libbz2.so.1 \
libc.so.6 \
libexslt.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
liblzma.so.5 \
libsqlite3.so.0 \
libwebkitgtk-6.0.so.4 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
