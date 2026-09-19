SUMMARY = "fwupd Backend for Discover"
DESCRIPTION = "A plugin for Discover to support updates of system firmware using fwupd."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "discover6-backend-fwupd-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "b65bc21f29f08ab70923e7b5bec2c683fe6375d3ea52ffd9a8c4d55b794efff7bea45fa379b7e84b1074b7b25e49b7d8731bd255695b5a8a9a3a45fa9a3ba87b"

RPROVIDES:${PN} += "discover-backend-fwupd \
discover6-backend-fwupd"

RDEPENDS:${PN} += "discover6 \
ld-linux-aarch64.so.1 \
libDiscoverCommon.so \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libfwupd.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
