SUMMARY = "Build environment for the KDE data plotting library"
DESCRIPTION = "Development files for KPlotWidget, which is a QWidget-derived class \
that provides a virtual base class for data plotting."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kplotting-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "9cf6c34dfaac11e399634524054c8ff49509d198893b2202fb248defac012dc7ba0070c122d6fe50e51b5e9e3a9e61b2d1ce8c1ef0cb3679668c97abd53a6a72"

RPROVIDES:${PN} += "cmake-KF6Plotting \
kf6-kplotting-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Plotting.so.6 \
libKF6Plotting6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
