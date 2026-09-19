SUMMARY = "Authenticators library for LeechCraft"
DESCRIPTION = "A library providing authenticators for various services like VKontakte."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-svcauth-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "4e942240066834872564992f38ec67b7b549cb395912e487797f3e51191488199946791fd2ff890043bcd8c0d25f55ebdd52bc407c3df37d839335b5ef32fd2f"

RPROVIDES:${PN} += "libleechcraft-util-svcauth-qt6-0-6-75 \
libleechcraft-util-svcauth-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-network-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
