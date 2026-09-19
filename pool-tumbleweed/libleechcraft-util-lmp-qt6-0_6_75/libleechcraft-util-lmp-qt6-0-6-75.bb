SUMMARY = "Utility library for LeechCraft Media Player"
DESCRIPTION = "A library providing some commonly used lmp plugin' models, \
as well as model-related classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-lmp-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "46f2c1668059091ad8722086c37889c9716154e06c6293f725b1cff98fdb78911ca007a86afcde1311e965fc8e70510da12c4f695dbeb4f784142ef5d53abbef"

RPROVIDES:${PN} += "libleechcraft-lmp-util-qt6.so.0.6.75 \
libleechcraft-util-lmp-qt6-0-6-75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgstreamer-1.0.so.0 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xsd-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
