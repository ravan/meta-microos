SUMMARY = "Practical and minimal image viewer"
DESCRIPTION = "qView is a Qt image viewer designed with minimalism and usability in mind. \
No cluttered interface, just your image and a titlebar."
LICENSE = "GPL-3.0-only"

PV = "7.1"

RPM_NAME = "qview-7.1-1.5.aarch64.rpm"
RPM_HASH = "63667de278c0ca7fcef49738df60f919d3f3530a2cd5c693d9e3784c060bc3262c849321396f2f477a03798c87ae92aaee906eb5d9da0f7a328aa96cf558059f"

RPROVIDES:${PN} += "qview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
