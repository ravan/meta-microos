SUMMARY = "Widgets for configuration dialogs: Build Environment"
DESCRIPTION = "KConfigWidgets provides easy-to-use classes to create configuration dialogs, as \
well as a set of widgets which uses KConfig to store their settings. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kconfigwidgets-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "73cf49dad6332f332ff1bb9bff8d292fcd855ea6efdba8b7f87ceb674439d9b7ea40d2e773838cc9de8f028cf98a262cb861979653c4ac64bfe791b130df5666"

RPROVIDES:${PN} += "cmake-KF6ConfigWidgets \
kf6-kconfigwidgets-devel"

RDEPENDS:${PN} += "cmake-KF6Codecs \
cmake-KF6ColorScheme \
cmake-KF6Config \
cmake-KF6WidgetsAddons \
ld-linux-aarch64.so.1 \
libKF6ConfigWidgets.so.6 \
libKF6ConfigWidgets6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
