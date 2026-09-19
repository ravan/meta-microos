SUMMARY = "LeechCraft Blasq Flickr client Module"
DESCRIPTION = "This package provides a Flickr image storage client subplugin \
for LeechCraft Blasq."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-blasq-spegnersi-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "03bd1baf7782a791fa9ec3f52a1b89c05ec66962fdf4c6b31237943d800a9a1889d19566494288e65099a899664e81ba91fb11888d9c4e3e1efd4b2ef46ab5f4"

RPROVIDES:${PN} += "leechcraft-blasq-spegnersi \
leechcraft-blasq-subplugin \
libleechcraft-blasq-spegnersi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-blasq \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
