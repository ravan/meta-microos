SUMMARY = "LeechCraft SSL certificate Module"
DESCRIPTION = "This package provides an SSL certificate manager plugin."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-certmgr-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "95eb69e55935c710d7382438e6f5bdd2d8a9e813787334f2ecf404e8609562ab5ef660c2d998617b127c82747c62c737789b5aba9425440b5b8a1edbaae7f547"

RPROVIDES:${PN} += "leechcraft-certmgr \
libleechcraft-certmgr.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
