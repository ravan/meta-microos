SUMMARY = "IconLoader library for QtXDG"
DESCRIPTION = "QtXDG icon loader libraries used in LXQt"
LICENSE = "GPL-3.0-only"

PV = "3.12.0"

RPM_NAME = "libQt5XdgIconLoader3-3.12.0-3.12.aarch64.rpm"
RPM_HASH = "b8540ee2ff9d94eb08417cebad03534e57097fb118de396cf78fc22d6c567767cb66aa6e4d128a203a2a55b696ca85973f1b509fdd18ad27330d06907f17f1f9"

RPROVIDES:${PN} += "libQt5XdgIconLoader.so.3 \
libQt5XdgIconLoader3 \
libqtxdgiconloader"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
