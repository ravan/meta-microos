SUMMARY = "Selection window for emoji text input"
DESCRIPTION = "Press Meta+. to open an emoji selection window."
LICENSE = "GPL-2.0-only"

PV = "6.7.5"

RPM_NAME = "plasma6-desktop-emojier-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "d8b7ae22e3c93580d6bd1d330f4cf3e8ee82b2c14ec5dc30489fa21e06b3f867c212f8ad0c1d8d976a6b2771ff1aefaade23bd531a7b68d83463a5caa00279d7"

RPROVIDES:${PN} += "plasma5-desktop-emojier \
plasma6-desktop-emojier"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
plasma6-desktop"

inherit rpm
