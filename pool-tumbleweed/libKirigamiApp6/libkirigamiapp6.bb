SUMMARY = "KirigamiApp library"
DESCRIPTION = "A set of 'widgets' i.e visual end user components along with a \
code to support them. Components are usable by both touch and \
desktop experiences providing a native experience on both, and \
look native with any QQC2 style (qqc2-desktop-theme, Material \
or Plasma). This package provides a helper to properly \
run a Kirigami app on all OSes."
LICENSE = "LGPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "libKirigamiApp6-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "87cd61702e166dcc444b5842d35af3f2e06d454866757f6526bbefb102ac1e510b0ae68d056ebd0b6e8c63689264bbfb99e01541b144886513571225d0ccbe01"

RPROVIDES:${PN} += "libKirigamiApp.so.6 \
libKirigamiApp6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
