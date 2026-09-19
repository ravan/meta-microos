SUMMARY = "Lazarus Component Library - Qt5 widgetset support"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package contains LCL components for developing applications \
using the Qt5 widgetset."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "4.8"

RPM_NAME = "lazarus-lcl-qt5-4.8-1.2.aarch64.rpm"
RPM_HASH = "6c8592667eb6984f213cf56e6b09386c39fb734290210208d570702593d9d9eef21da135035db968306a343ec300406a70dff891c7e81f0ff1ebb5abf139884e"

RPROVIDES:${PN} += "lazarus-lcl-qt5"

RDEPENDS:${PN} += "lazarus-lcl \
libQt5Pas-devel"

inherit rpm
