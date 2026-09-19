SUMMARY = "Solitaire Card Games for GNOME"
DESCRIPTION = "Aisleriot is a compilation of 80 different solitaire card games."
LICENSE = "GPL-3.0-or-later"

PV = "3.22.35"

RPM_NAME = "aisleriot-3.22.35-3.4.aarch64.rpm"
RPM_HASH = "349ac15284b236667830c0210a8520ac07e77f9e3e09fb05d87952c45f7ff2aca52955f5051a38521c0e795eb3fe6128c612656926143d68de5eca642ffc36d3"

RPROVIDES:${PN} += "aisleriot"

RDEPENDS:${PN} += "guile \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libguile-3.0.so.1 \
librsvg-2.so.2"

inherit rpm
