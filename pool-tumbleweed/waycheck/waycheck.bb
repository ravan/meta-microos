SUMMARY = "GUI that displays protocols implemented by a Wayland compositor"
DESCRIPTION = "GUI that displays protocols implemented by a Wayland compositor."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "waycheck-1.7.0-1.7.aarch64.rpm"
RPM_HASH = "c6fb951138741e31b791524a8c878292bca7f49d63ef1636b72fdae9ae59e5c2cd2570b3cab72fd1a77f2903576cf1ca0dc5239b4046a61d8a49c516549e55c6"

RPROVIDES:${PN} += "waycheck"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
