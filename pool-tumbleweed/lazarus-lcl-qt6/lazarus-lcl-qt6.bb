SUMMARY = "Lazarus Component Library - Qt6 widgetset support"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package contains LCL components for developing applications \
using the Qt6 widgetset."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "4.8"

RPM_NAME = "lazarus-lcl-qt6-4.8-1.2.aarch64.rpm"
RPM_HASH = "973c45eb200e3bf9edf2c08dfca4d644d33bcd5ee1d181795a9329534a6432b23c5c6196879ee47f4da4df9a4c6391b0be0492677b66ed3c3d5a7a19ab8f459f"

RPROVIDES:${PN} += "lazarus-lcl-qt6 \
libQt6Pas.so.6"

RDEPENDS:${PN} += "lazarus-lcl \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Pas-devel \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
