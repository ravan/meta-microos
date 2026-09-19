SUMMARY = "Visual Process Manager"
DESCRIPTION = "Qps is a visual process manager, an X11 version of 'top' or 'ps' that \
displays processes in a window and lets you sort and manipulate them. It \
displays some general system information, and many details about current \
processes."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "qps-2.13.0-1.2.aarch64.rpm"
RPM_HASH = "4272661a82937d3850e0636a346e413edb6cabd3e82ff76a45fa84ad95ea79b4f386ff7738ae8cb0f8e3919e6c9871e42b77f0a79f18a520b1f94545748f6da3"

RPROVIDES:${PN} += "qps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
liblxqt.so.2 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
