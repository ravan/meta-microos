SUMMARY = "KDE Access to window manager: Build Environment"
DESCRIPTION = "Convenience access to certain properties and features of the window manager. \
 \
KWindowSystem provides information about the state of the window manager and \
allows asking the window manager to change the using a more high-level \
interface than the NETWinInfo/NETRootInfo low-level classes. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kwindowsystem-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "15e76384f5c44b22e517198a2477ba6755aced6d75d52c533d644bc6400e10a05cca71028b41def3baedac5f12027a87537c764ae6367f822b7132d318a65636"

RPROVIDES:${PN} += "cmake-KF6WindowSystem \
kf6-kwindowsystem-devel \
pkgconfig-KF6WindowSystem"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libKF6WindowSystem6 \
pkgconfig-Qt6Gui \
pkgconfig-x11 \
pkgconfig-xcb"

inherit rpm
