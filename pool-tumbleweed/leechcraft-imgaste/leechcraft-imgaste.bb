SUMMARY = "LeechCraft Image Paster Module"
DESCRIPTION = "This module provides a simple image paster plugin from LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-imgaste-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "0d998a2d8db7631a5f4127dd110bf8fdb7aa8e0535927e2c9d90790442d8ba4f8fe356d3f658c773bfc2ab4760eeab4c3d13dd2bc45f5a23e0d17182e8711f93"

RPROVIDES:${PN} += "leechcraft-imgaste \
libleechcraft-imgaste.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
