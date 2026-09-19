SUMMARY = "UnifiedPush client components"
DESCRIPTION = "KUnifiedPush provides push notifications for KDE applications. Push \
notifications are a mechanism to support applications that occasionally need to \
receive some kind of information from their server-side part, and where \
receiving in a timely manner matters. \
 \
Three possible provider backends are provided: \
- Ntfy \
- Nextpush \
- Gotify"
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kunifiedpush-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "89d9a459144300ed9f90dca62c7b3b9885d7f0f81817751be0d46651ab93ae85b8c6f55f368f1b29c0f22c60541028c65e7ff26d2366c76e2b248d3e23f55a27"

RPROVIDES:${PN} += "config-kunifiedpush \
kunifiedpush"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKUnifiedPush.so.1 \
libKUnifiedPush1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6WebSockets.so.6 \
libc.so.6 \
libcrypto.so.3 \
libstdc++.so.6 \
systemsettings6"

inherit rpm
