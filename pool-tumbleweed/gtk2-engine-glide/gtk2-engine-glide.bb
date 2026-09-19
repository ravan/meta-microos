SUMMARY = "Glide GTK+ 2 Theme Engine"
DESCRIPTION = "This packages provides the Glide engine for GTK+ 2, originally written \
for the Glider theme."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-glide-2.20.2-23.6.aarch64.rpm"
RPM_HASH = "21801f7ce008b4a710f9e1515700d6381ec5738596cfe8c7de8110cc2ce745503e5a677fd02de80940b4ee4b97b585c46705294d22a5bb6f0319a9e8f1c1b174"

RPROVIDES:${PN} += "gtk2-engine-glide \
libglide.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
