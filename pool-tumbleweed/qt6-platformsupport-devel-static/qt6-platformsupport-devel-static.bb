SUMMARY = "Qt PlatformSupport module"
DESCRIPTION = "Qt PlatformSupport static library. This package provides private headers and \
consequently do not have any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-platformsupport-devel-static-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "60e61cfdc173f2511727eda666767f954171a82da6f8648edefc36986f82ffec7042d718720e45d0ed73766d4145b949821a76cef0aebd818e6accc3e261798d"

RPROVIDES:${PN} += "cmake-Qt6DeviceDiscoverySupportPrivate \
cmake-Qt6FbSupportPrivate \
cmake-Qt6InputSupportPrivate \
qt6-platformsupport-devel-static \
qt6-platformsupport-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
pkgconfig-atspi-2 \
pkgconfig-egl \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-gl \
pkgconfig-glib-2.0 \
pkgconfig-libinput \
pkgconfig-libudev \
pkgconfig-mtdev \
pkgconfig-tslib \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xkbcommon \
pkgconfig-xkbcommon-x11 \
pkgconfig-xrender"

inherit rpm
