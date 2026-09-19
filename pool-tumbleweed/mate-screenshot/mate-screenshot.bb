SUMMARY = "MATE screenshot maker"
DESCRIPTION = "This is the MATE screenshot maker as shipped with the MATE utilities. \
mate-screenshot is a program which cantake desktop screenshots and \
save them."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-screenshot-1.28.0-2.6.aarch64.rpm"
RPM_HASH = "07d3319d4e7dbdd447b667772c0c8d168e4ef6aa6c15a606b3d8208cc90d0a0e487871bc13bdc14f68823d283586630e5280c55e763b601fb47369bbc49e01ac"

RPROVIDES:${PN} += "mate-screenshot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
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
libm.so.6"

inherit rpm
