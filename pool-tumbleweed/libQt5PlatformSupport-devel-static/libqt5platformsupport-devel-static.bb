SUMMARY = "Qt PlatformSupport module"
DESCRIPTION = "Qt PlatformSupport module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5PlatformSupport-devel-static-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "fe4ee31cfd347845634dcff0bdf53c77a3605489db6175b0984b5acf10017ee1c363a7b24a1a36506e429515d9aaa49d2f02351e13c6a7da5997351b2e0d405d"

RPROVIDES:${PN} += "cmake-Qt5AccessibilitySupport \
cmake-Qt5DeviceDiscoverySupport \
cmake-Qt5EdidSupport \
cmake-Qt5EglSupport \
cmake-Qt5EventDispatcherSupport \
cmake-Qt5FbSupport \
cmake-Qt5FontDatabaseSupport \
cmake-Qt5InputSupport \
cmake-Qt5LinuxAccessibilitySupport \
cmake-Qt5PlatformCompositorSupport \
cmake-Qt5ServiceSupport \
cmake-Qt5ThemeSupport \
cmake-Qt5VulkanSupport \
cmake-Qt5XkbCommonSupport \
libQt5PlatformSupport-devel-static"

RDEPENDS:${PN} += "libQt5Core-devel \
libQt5Gui-devel \
libQt5PlatformHeaders-devel \
pkgconfig-Qt5DBus \
pkgconfig-egl \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-gl \
pkgconfig-glib-2.0 \
pkgconfig-libinput \
pkgconfig-libudev \
pkgconfig-mtdev \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xkbcommon \
pkgconfig-xkbcommon-x11 \
pkgconfig-xrender \
tslib-devel"

inherit rpm
