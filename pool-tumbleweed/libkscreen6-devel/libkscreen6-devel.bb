SUMMARY = "Plasma screen management library (development package)"
DESCRIPTION = "Development files belonging to libkscreen, dynamic display management in Plasma"
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libkscreen6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "83d8d2d67e1aab163fa04ae4284f831db5e9e97d697552c0baade6200a1364f8d534f97576348e14e71f003feae38385ee0e95fbcd0fafea7f295d4e91d60a45"

RPROVIDES:${PN} += "cmake-KF6Screen \
libkscreen6-devel \
pkgconfig-KF6Screen"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libKF6Screen8 \
libKF6ScreenDpms8 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
