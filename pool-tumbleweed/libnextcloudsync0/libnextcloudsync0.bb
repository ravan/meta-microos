SUMMARY = "The Nextcloud synchronisation library"
DESCRIPTION = "The Nextcloud Desktop Client synchronisation library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "34.0.3"

RPM_NAME = "libnextcloudsync0-34.0.3-1.1.aarch64.rpm"
RPM_HASH = "7902ef4fc3f31275fc3133ab649d2b6f8414a8f40b9f9e7e7cc1a32e002076f8aeb350a7d56a5aeb71d8a16cacaaa3a8e1ce3003a6296762b6d4012c1e48aa57"

RPROVIDES:${PN} += "libnextcloud-csync.so.0 \
libnextcloudsync.so.0 \
libnextcloudsync0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libp11.so.3 \
libqt6keychain.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
