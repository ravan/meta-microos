SUMMARY = "Xfce Dictionary Client Application"
DESCRIPTION = "xfce4-dict allows you to search different kinds of dictionary services for \
words or phrases and shows you the result. Currently you can query a Dict \
server (RFC 2229), any online dictionary service by opening a web browser or \
search for words using the aspell/ispell program."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.10"

RPM_NAME = "xfce4-dict-0.8.10-1.1.aarch64.rpm"
RPM_HASH = "b2b1509cb3226590056adfc41b5e11d9bd3a5073ccd7791c0657fb8f0a43b0c65701b760f230696ad0f97a30d4c226419ae52339499182ec86ede05ab9c66c0c"

RPROVIDES:${PN} += "xfce4-dict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xdg-utils"

inherit rpm
