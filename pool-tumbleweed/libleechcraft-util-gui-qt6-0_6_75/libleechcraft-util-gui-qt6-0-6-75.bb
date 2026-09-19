SUMMARY = "GUI utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used GUI-related \
widgets, classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-gui-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "d0661b2df2796f808677522ef1ef41b50e38cd6896c2fcc2377eee09881d4bfa86ef36ec53b67c24860e676c79c54887b0b7407f304f48a56cc63f4f8a1abc47"

RPROVIDES:${PN} += "libleechcraft-util-gui-qt6-0-6-75 \
libleechcraft-util-gui-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-shortcuts-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
