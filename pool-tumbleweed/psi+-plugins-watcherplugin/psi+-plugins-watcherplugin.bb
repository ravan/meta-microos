SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to monitor the status of specific roster contacts, as \
well as for substitution of standard sounds of incoming messages."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-watcherplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "31e4d160bdc0408b14cd867fc94f0496c7e39acc0b5e242f4183a8721c214732e55143a23e7e3857c20fa71e2ef68df5e4fa3876fccc8d7b973d0992f270801d"

RPROVIDES:${PN} += "libwatcherplugin.so \
psi+-plugins-watcherplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
