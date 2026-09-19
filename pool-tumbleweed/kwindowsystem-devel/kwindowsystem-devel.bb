SUMMARY = "KDE Access to window manager: Build Environment"
DESCRIPTION = "Convenience access to certain properties and features of the window manager. \
 \
KWindowSystem provides information about the state of the window manager and \
allows asking the window manager to change the using a more high-level \
interface than the NETWinInfo/NETRootInfo low-level classes. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kwindowsystem-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "356bba254d63e1e2db075c83841f950ab9db5bd8680a98f460f59966d579be3e2c57c513b793a2689494f57bbcad57558f6cb70372b803529d7a085d8bc1543b"

RPROVIDES:${PN} += "cmake-KF5WindowSystem \
kwindowsystem-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5Widgets \
libKF5WindowSystem5 \
pkgconfig-x11 \
pkgconfig-xcb"

inherit rpm
