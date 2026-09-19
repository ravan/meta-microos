SUMMARY = "LXQt Control Center"
DESCRIPTION = "System Configuration and Control Center for LXQt"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-config-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "0ea61814fafc4773e2bca8a93340a64b7c14f3bef93679dcaf85f90434cc45ef50b4ba3debed11e51d95b5a4a51ab836ff2c73af60f5c841a94cdff8f2a2a0a9"

RPROVIDES:${PN} += "liblxqt-config-cursor.so \
lxqt-config"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Screen.so.8 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xdg.so.4 \
libQt6Xml.so.6 \
libX11.so.6 \
libXcursor.so.1 \
libXfixes.so.3 \
libXi.so.6 \
libc.so.6 \
liblxqt.so.2 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1 \
libxcb-randr.so.0 \
libxcb.so.1 \
libz.so.1"

inherit rpm
