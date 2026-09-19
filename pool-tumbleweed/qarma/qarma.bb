SUMMARY = "Tool for creating Qt dialog boxes"
DESCRIPTION = "Qarma is a tool to create dialog boxes, based on Qt. It's a clone of \
Zenity which was written for GTK+."
LICENSE = "GPL-2.0-Only"

PV = "1.1.1"

RPM_NAME = "qarma-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "fe862b3e9ab6862d194a4529330d66fdacb0bd12f1c2b5a8bb953fa22d64081f9ec272d46df73412490ea803a7e203be3659b2fba00850cb2d98d8b40366ded9"

RPROVIDES:${PN} += "qarma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
