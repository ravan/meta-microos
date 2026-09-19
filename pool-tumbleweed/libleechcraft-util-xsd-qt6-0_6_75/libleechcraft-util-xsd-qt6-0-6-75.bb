SUMMARY = "XSD utility library for LeechCraft"
DESCRIPTION = "A library providing some classes to be used with the \
XmlSettingsDialog LeechCraft subsystem."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-xsd-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "852a8cf922f5183ad893ebdf587454a4d9ecb1a57e1314a00c20f4a7698085387b7ecced020219778a1768f06a7d53b8bf5432e252993976be12f983cfe72034"

RPROVIDES:${PN} += "libleechcraft-util-xsd-qt6-0-6-75 \
libleechcraft-util-xsd-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-network-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
