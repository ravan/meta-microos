SUMMARY = "Cross-plugin communication utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used primitives for \
communications between different plugins in LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-xpc-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "f606e420f9481f8743cb92ef366eced4fcc28aaa6f52e4bc02e20029517a9cf17bc0c5d5d89e6d69a8fb23d0c2209c6ae6ff7cd50164c2bfb056fecca202aec5"

RPROVIDES:${PN} += "libleechcraft-util-xpc-qt6-0-6-75 \
libleechcraft-util-xpc-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
