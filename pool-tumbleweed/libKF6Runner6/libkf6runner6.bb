SUMMARY = "KDE Framework for providing different actions given a string query"
DESCRIPTION = "KDE Framework for providing different actions given a string query."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Runner6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "99be1204fd9806571d6fa23ad7a68242d22322ebd8207ea8bfe785c7b3c363ba70356de278bb99618f8259c598367f0d3fc27d66e8d26ff06aae568117421a08"

RPROVIDES:${PN} += "libKF6Runner.so.6 \
libKF6Runner6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-krunner \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemModels.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
