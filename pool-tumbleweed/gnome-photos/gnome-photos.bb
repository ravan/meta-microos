SUMMARY = "Photo viewer for GNOME"
DESCRIPTION = "Photos, like Documents, Music and Videos, is one of the core GNOME \
applications meant for find and reminding the user about her content. \
The internal architecture Photos is based on Documents -- the document \
manager application for GNOME, because they share similar UI/UX \
patterns and objectives."
LICENSE = "GPL-3.0-or-later"

PV = "44.0+23"

RPM_NAME = "gnome-photos-44.0+23-3.6.aarch64.rpm"
RPM_HASH = "282645f5c2888017176c91dac5aecb8a604322e8ffbcd94bd788995ef382f4949511a7de579b6b191182bc21351c11eb6cf58990996d3b3683fda0753546eb58"

RPROVIDES:${PN} += "gnome-photos \
libgnome-photos.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libbabl-0.1.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libdazzle-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgegl-0.4.so.0 \
libgeocode-glib-2.so.0 \
libgexiv2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libportal-gtk3.so.1 \
libportal.so.1 \
libtinysparql-3.0.so.0 \
localsearch"

inherit rpm
