SUMMARY = "Property displayer for X"
DESCRIPTION = "xprop displays window and font properties of an X server."
LICENSE = "MIT"

PV = "1.2.8"

RPM_NAME = "xprop-1.2.8-1.8.aarch64.rpm"
RPM_HASH = "815c4c4f205e2cf3004c1007ed0577d1654f0f54f8243d6d0042b68a9cb0a194fd9de61838c5e20ce6e123a4cc73a907e1882225cae71bd165983a26b125fea1"

RPROVIDES:${PN} += "xprop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
