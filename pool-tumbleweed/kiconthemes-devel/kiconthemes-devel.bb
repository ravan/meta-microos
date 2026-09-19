SUMMARY = "Icon GUI utilities: Build Environment"
DESCRIPTION = "This library contains classes to improve the handling of icons \
in applications using the KDE Frameworks. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.116.0"

RPM_NAME = "kiconthemes-devel-5.116.0-1.14.aarch64.rpm"
RPM_HASH = "7084e361791b7fbd1a2a214807c6cb2bc1be026dab76873bdb908579bc91c98844e20df13c48dce27e8d2d86c052f8026ce66f27d60d4259217d58614d2f72c5"

RPROVIDES:${PN} += "cmake-KF5IconThemes \
kiconthemes-devel"

RDEPENDS:${PN} += "cmake-Qt5Widgets \
ld-linux-aarch64.so.1 \
libKF5IconThemes.so.5 \
libKF5IconThemes5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
