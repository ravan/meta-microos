SUMMARY = "IconLoader library for QtXDG"
DESCRIPTION = "QtXDG icon loader libraries used in LXQt"
LICENSE = "LGPL-2.1-only & SUSE-LGPL-2.1-with-digia-exception-1.1"

PV = "4.4.0"

RPM_NAME = "libQt6XdgIconLoader4-4.4.0-1.7.aarch64.rpm"
RPM_HASH = "d1db4f4e4c9d53f36a1434397a2ff1646554288daeb62435ecbf8d553f31d70a1fc1dedfc3e6ceea5175e50444f3b8548e057f856ce488809530d3aaeff6e06a"

RPROVIDES:${PN} += "libQt6XdgIconLoader.so.4 \
libQt6XdgIconLoader4 \
libQt6XdgIconPlugin.so \
libqtxdgiconloader"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
