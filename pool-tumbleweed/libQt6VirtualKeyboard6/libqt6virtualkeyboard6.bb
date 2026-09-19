SUMMARY = "Qt 6 VirtualKeyboard library"
DESCRIPTION = "Qt VirtualKeyboard provides an input framework and reference keyboard frontend \
for Qt 6."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6VirtualKeyboard6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f95669d07f211b2aad6152190ed453bf015c9eb7a9d2c8042bc82bc6d328329c59890c2dce5ce93c37b6767b08ca3f1a59267922cba064770042f725c76d78b8"

RPROVIDES:${PN} += "libQt6VirtualKeyboard.so.6 \
libQt6VirtualKeyboard6 \
libQt6VirtualKeyboardSettings.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6-virtualkeyboard"

inherit rpm
