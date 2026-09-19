SUMMARY = "LeechCraft Poshuku Ad Filter Module"
DESCRIPTION = "This package provides an advertisement filter for LeechCraft Poshuku. \
 \
Features: \
 * Support for Firefox AdBlock+ block lists. \
 * Support for detection and subscription to such lists. \
 * Automatic updates of block lists. \
 * User filters: blocking arbitrary images. \
 * Support for replacing Adobe Flash objects with a 'Load flash' button. \
 * Whitelists for the Flash blocker."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-poshuku-cleanweb-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "c151785c6e1994bca37b2e6f8a4b0d086b577e8aafd3dda7eb8cc68e835196e413d3c1519b90de03174099a628173597828046c95af9e9348264369cd82f9d1d"

RPROVIDES:${PN} += "leechcraft-poshuku-cleanweb \
libleechcraft-poshuku-cleanweb.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-network-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
