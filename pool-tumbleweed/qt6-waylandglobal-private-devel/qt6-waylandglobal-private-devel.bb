SUMMARY = "Collection of build features used by qt6-wayland libraries"
DESCRIPTION = "This package contains enabled features information shared by all the \
qt6-wayland libraries."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-waylandglobal-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "5ee48f5b9e6b9604af8e3f30b31888e943eea7e724aa9504d0b7f6846ee27fe9ec44703abc551a84647826fe80fa81ed1fb557ec77b27c60a1682563914757fb"

RPROVIDES:${PN} += "cmake-Qt6WaylandGlobalPrivate \
qt6-waylandglobal-private-devel"

RDEPENDS:${PN} += ""

inherit rpm
