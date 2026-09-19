SUMMARY = "Qt 6 VirtualKeyboardQml private library"
DESCRIPTION = "QML module implementation for qtvirtualkeyboard."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6VirtualKeyboardQml6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "2bf76c3d9bd9cc844ca602179a336c132e48dfccaa3efb06e79f5015884ff53e36d7c20207734fb94a658e7f0433567b57f6d7bc03c25599ee9888a1c5666d58"

RPROVIDES:${PN} += "libQt6VirtualKeyboardQml.so.6 \
libQt6VirtualKeyboardQml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6"

inherit rpm
