SUMMARY = "Qt 6 LabsPlatform library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsPlatform library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-labsplatform-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "62f673303ed301ae3c06b6ca40063d7a35e2fe61ecd38f9ba3a511858cbc89f49e1fd9db07ced3340be8830fb85649031e9ce22ec8b30979f78ddeeaf0f760c7"

RPROVIDES:${PN} += "cmake-Qt6LabsPlatform \
cmake-Qt6LabsPlatformPrivate \
pkgconfig-Qt6LabsPlatform \
qt6-labsplatform-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6QmlPrivate \
cmake-Qt6QuickPrivate \
cmake-Qt6QuickTemplates2Private"

inherit rpm
