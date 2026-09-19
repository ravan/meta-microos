SUMMARY = "Monocle utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used monocle plugin' models, \
as well as model-related classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-monocle-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "cd96a6ce6a12e61dbe755a81aa2c7c8a7f115b78886afc8ef16c8b31fb35bc0f20d1c087007aea9a87e1c3a6b976f14790e8b6ea9f40f25215290e00fb8b57df"

RPROVIDES:${PN} += "libleechcraft-monocle-util-qt6.so.0.6.75 \
libleechcraft-util-monocle-qt6-0-6-75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
