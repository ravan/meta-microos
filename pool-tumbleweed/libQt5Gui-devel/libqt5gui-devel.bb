SUMMARY = "Development files for the Qt5 GUI library"
DESCRIPTION = "Development files for the Qt5 GUI library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Gui-devel-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "0f19e52f18cbd1282847262b0120b910f254c417a8ff90d0fe3956799abc82ea27d4f1afee97280df674fe1cf550b8667cc2253bcdc94342696891e76c88b13c"

RPROVIDES:${PN} += "cmake-Qt5EglFSDeviceIntegration \
cmake-Qt5EglFsKmsSupport \
cmake-Qt5Gui \
cmake-Qt5XcbQpa \
libQt5Gui-devel \
pkgconfig-Qt5Gui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libGLESv3-devel \
libQt5Core-devel \
libQt5Gui5 \
pkgconfig-Qt5Core \
pkgconfig-egl \
pkgconfig-gbm \
pkgconfig-glesv2 \
pkgconfig-libdrm \
vulkan-devel"

inherit rpm
