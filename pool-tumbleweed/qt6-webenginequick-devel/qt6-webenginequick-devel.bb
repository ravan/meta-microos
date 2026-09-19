SUMMARY = "Development files for the Qt 6 WebEngineQuick library"
DESCRIPTION = "Development files for the Qt 6 WebEngineQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webenginequick-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "7e3125e6781d6b69537400e6884a9d232bfd24e7da023919428d94debebbdc8d29e785525ae98ba6b1eece3fc690f902be4c1317a36db3e31394692158a73f9e"

RPROVIDES:${PN} += "cmake-Qt6WebEngineQuick \
cmake-Qt6WebEngineQuickDelegatesQml \
pkgconfig-Qt6WebEngineQuick \
pkgconfig-Qt6WebEngineQuickDelegatesQml \
qt6-webenginequick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6WebChannelQuick \
cmake-Qt6WebEngineCore \
libQt6WebEngineQuick6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6WebChannelQuick \
pkgconfig-Qt6WebEngineCore"

inherit rpm
