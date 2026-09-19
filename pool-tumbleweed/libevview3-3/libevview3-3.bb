SUMMARY = "GNOME Document Viewer System Library"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "48.4"

RPM_NAME = "libevview3-3-48.4-2.1.aarch64.rpm"
RPM_HASH = "e475abca515ce28c863e9771ea03cd3bc7efe638f070ce110f6a4781ed2b7ecd756bb2340dbf13752e56195aef85e0703269408f0536872ec28d3ae8a42b1df7"

RPROVIDES:${PN} += "libevview3-3 \
libevview3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libevdocument3.so.4 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.3 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
