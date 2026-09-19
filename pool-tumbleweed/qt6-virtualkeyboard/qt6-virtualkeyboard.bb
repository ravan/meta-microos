SUMMARY = "Framework for writing or integrating input methods and engines for Qt 6"
DESCRIPTION = "Qt VirtualKeyboard provides an input framework and reference keyboard frontend \
for Qt 6."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-virtualkeyboard-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "8af8b220f1ad6a3490f108ae10319407b7d56dbf3ba446a1a310e2f99f5ab9719222ccf8ce1b6e29777b430518df65a5667466b0cc2d8603667dede5ea9a4cac"

RPROVIDES:${PN} += "libqtvirtualkeyboardplugin.so \
qt6-virtualkeyboard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6VirtualKeyboard.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
