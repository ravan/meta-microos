SUMMARY = "LeechCraft HTTP Accept-Language header Module"
DESCRIPTION = "This module provides a HTTP Accept-Language header configurator."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-intermutko-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "fab92e323e20a4cca57238e5a5ade4f1f633299e5c9f65e16158a74ddae688f56e8112e71228abc2639c3c01f47c7a843ffdbea4f16bbe18243e015f5454a04f"

RPROVIDES:${PN} += "leechcraft-intermutko \
libleechcraft-intermutko.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
