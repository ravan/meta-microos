SUMMARY = "Breathing techniques helper"
DESCRIPTION = "Kalm can teach you different breathing techniques."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kalm-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c769c24a6c6428e058598e8a774767e14aeb41aa1b5fdf64ab5889a0e2a6da3e40c39b986a710d366f7d218b3dbe573fa596599d0377bb7f795b7abcac606ad2"

RPROVIDES:${PN} += "kalm"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kf6-qqc2-desktop-style \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
