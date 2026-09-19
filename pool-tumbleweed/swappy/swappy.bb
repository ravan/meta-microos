SUMMARY = "Wayland compositor screenshot editor"
DESCRIPTION = "A Wayland native snapshot and editor tool"
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "swappy-1.8.0-1.6.aarch64.rpm"
RPM_HASH = "01f63249c08435fec90923cb7c310b6ee6f58624688585ac74703762fa6e066c1484c5c3a53ca32f64c4f3561ab7b7089cbde3c30dd6cdd4274bc0c1ac613a8f"

RPROVIDES:${PN} += "swappy"

RDEPENDS:${PN} += "fontawesome-fonts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
