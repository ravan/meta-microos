SUMMARY = "A keybinding viewer for i3 and other programs"
DESCRIPTION = "A keybinding viewer for i3 and other programs."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.4"

RPM_NAME = "remontoire-1.4.4-1.6.aarch64.rpm"
RPM_HASH = "ec0573a6ef4b025168e3281bafede03183ae04818cb4bd21fb529ac3a2a66bf9378fc038e6bbde6cb51607bae24b500c82f19dca5c9513f1757c22b5abc9c7f0"

RPROVIDES:${PN} += "remontoire"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0"

inherit rpm
