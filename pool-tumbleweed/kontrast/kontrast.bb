SUMMARY = "Contrast checker"
DESCRIPTION = "Kontrast allows choosing background and text color that are easy to read when \
used together."
LICENSE = "CC0-1.0 & GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kontrast-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f8faad0c3c82cb36a915689d32d805443bd3b3cfcb3d8da5afb77430f47d406a074c135148e1a5816d07875181a9e2837b4ac9da77b62ff42d1aac84747fee7e"

RPROVIDES:${PN} += "kontrast"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kf6-qqc2-desktop-style \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libfuturesql6.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6-sql-sqlite"

inherit rpm
