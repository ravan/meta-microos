SUMMARY = "Header files for the Gwenhywfar multi-platform helper library"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (e.g. for handling and parsing of \
configuration files, reading/writing of XML files, interprocess \
communication etc)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "gwenhywfar-qt6-devel-5.14.1-1.5.aarch64.rpm"
RPM_HASH = "1e0bf4eee8946e3c02b0ed54a5175d820fd167fd7ed85ab146aeb8235e9b81aec56fcf9e549db49f4fe59b6399c1e823d0d981288814aaa89ced23865c2342b7"

RPROVIDES:${PN} += "cmake-gwengui-qt6 \
gwenhywfar-qt6-devel \
pkgconfig-gwengui-qt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Widgets \
glibc-devel \
gwenhywfar-devel \
libgwengui-qt6-79"

inherit rpm
