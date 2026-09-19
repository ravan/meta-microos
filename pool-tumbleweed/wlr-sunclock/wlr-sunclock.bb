SUMMARY = "Wayland desktop widget to show to the sun's shadows on earth"
DESCRIPTION = "Wayland desktop widget to show to the sun's shadows on earth."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "wlr-sunclock-1.2.1-2.2.aarch64.rpm"
RPM_HASH = "f7ed072130f3a6abd0cd6f837459cd2bab9c31815698ef4815d99ea62053c27e01165f62f8f187b10aec0f7c7e4bc55c89f203d2f35778cbe314878e7bb7453b"

RPROVIDES:${PN} += "wlr-sunclock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtk4-layer-shell.so.0 \
libm.so.6 \
librsvg-2.so.2"

inherit rpm
