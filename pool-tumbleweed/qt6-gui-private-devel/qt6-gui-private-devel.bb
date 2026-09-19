SUMMARY = "Non-ABI stable API for the Qt 6 GUI libraries"
DESCRIPTION = "This package provides private headers of libQt6Gui that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-gui-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "89aae90ef5f697e753b68b9aa9a74418b76a23b2b044088172edbd631b6a10353d24027b26704a3737afb7c9d0191b17065eb0d24e3161a41ca2e93fd6174300"

RPROVIDES:${PN} += "cmake-Qt6EglFSDeviceIntegrationPrivate \
cmake-Qt6EglFsKmsGbmSupportPrivate \
cmake-Qt6EglFsKmsSupportPrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6XcbQpaPrivate \
qt6-gui-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6DeviceDiscoverySupportPrivate \
cmake-Qt6FbSupportPrivate \
cmake-Qt6Gui \
cmake-Qt6InputSupportPrivate \
cmake-Qt6OpenGLPrivate \
libQt6Gui6 \
pkgconfig-xkbcommon \
qt6-kmssupport-private-devel"

inherit rpm
