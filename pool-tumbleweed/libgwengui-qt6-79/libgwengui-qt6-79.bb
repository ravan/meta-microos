SUMMARY = "Qt6 UI backend for the gwenhywfar multi-platform helper library"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication). \
 \
This package provides the Qt6 implementation of the generic UI toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "libgwengui-qt6-79-5.14.1-1.5.aarch64.rpm"
RPM_HASH = "5f597994f40ed989cad20ab9c3758d1fed52ba2bcf0e86dcaa21cea457876c3dafd636ea0a6d081ef64eda865e4e185cc0e87554d0608ec2dea9151200973bae"

RPROVIDES:${PN} += "libgwengui-qt6-79 \
libgwengui-qt6.so.79"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgwengui-cpp.so.79 \
libgwenhywfar.so.79 \
libstdc++.so.6"

inherit rpm
