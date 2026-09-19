SUMMARY = "The ownCloud synchronization library"
DESCRIPTION = "The ownCloud synchronization library. It implements the ownCloud \
sync algorithm that keeps a local directory in sync with the \
content on your cloud."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "6.0.3"

RPM_NAME = "libowncloudsync0-6.0.3-1.6.aarch64.rpm"
RPM_HASH = "4dddb1f3b229d1bc0248bdeac885e7614619509404bf506e5513c704c652119286528b083601af8507ea6e0b106cc49f753c871bc7f080a3f37149e34750f454"

RPROVIDES:${PN} += "libownCloudCsync.so.0 \
libownCloudLibSync.so.0 \
libownCloudResources.so.0 \
libowncloudsync0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLibreGraphAPI.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libqt6keychain.so.1 \
libqt6keychain1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
