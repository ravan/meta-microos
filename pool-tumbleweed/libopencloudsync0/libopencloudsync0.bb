SUMMARY = "The OpenCloud synchronization library"
DESCRIPTION = "The OpenCloud synchronization library. It implements the OpenCloud \
sync algorithm that keeps a local directory in sync with the \
content on your cloud."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.0.0"

RPM_NAME = "libopencloudsync0-4.0.0-1.1.aarch64.rpm"
RPM_HASH = "0b85a0e95bc08ac2ae606ddceeb747b4d2edefaea0caebb7531f03cc183db7ccbfd98ed072bf7bc8771763e262236fcdc93670b1a5741b3bcaa62c4e20232038"

RPROVIDES:${PN} += "libOpenCloudLibSync.so.0 \
libOpenCloudResources.so.0 \
libopencloudsync0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libqt6keychain.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
