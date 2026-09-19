SUMMARY = "Shortcut utility library for LeechCraft"
DESCRIPTION = "A library easing shortcut usage in LeechCraft, particularly the \
configurable shortcuts subsystem."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-shortcuts-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "cc55941f6ec3f3caa64e694e8079268318b7223a8f3fe78c0b84da96bf5d75707e6ae3cba0728f19bf1bbad58385a51f11d3d713fe483ca3900cb89ef4dad5cb"

RPROVIDES:${PN} += "libleechcraft-util-shortcuts-qt6-0-6-75 \
libleechcraft-util-shortcuts-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
