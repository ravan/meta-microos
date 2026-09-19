SUMMARY = "QML imports for kconfig"
DESCRIPTION = "QML imports for kconfig."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kconfig-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "53c33ece7d032fe2c8c3d06212ea40a5331bd2b8e5a3806375f0576f711b0909311ee428cb5e2579c6825c46b755edff685227610390a57b073a58f7d8d71b3b"

RPROVIDES:${PN} += "kf6-kconfig-imports \
libKF6ConfigQmlplugin.so \
qt6qmlimport-org.kde.config \
qt6qmlimport-org.kde.config.254"

RDEPENDS:${PN} += "libKF6ConfigQml.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
