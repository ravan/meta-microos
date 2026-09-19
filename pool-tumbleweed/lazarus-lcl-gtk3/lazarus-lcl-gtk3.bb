SUMMARY = "Lazarus Component Library - GTK3 widgetset support"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package contains LCL components for developing applications \
using the GTK3 widgetset."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "4.8"

RPM_NAME = "lazarus-lcl-gtk3-4.8-1.2.aarch64.rpm"
RPM_HASH = "c165bbc106fea0ad68fdf28c237fca47803c5bac7295c552dd4bcb81ec166566708627bece161df96d544a81274f545183ceed954a7ce3451e528dba46cd9d45"

RPROVIDES:${PN} += "lazarus-lcl-gtk3"

RDEPENDS:${PN} += "gtk3-devel \
lazarus-lcl"

inherit rpm
