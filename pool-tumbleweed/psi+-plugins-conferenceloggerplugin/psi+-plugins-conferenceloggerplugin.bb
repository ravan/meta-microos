SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to save conference logs in which the Psi+ user sits."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-conferenceloggerplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "f928666742aefb813adb3a563a0acd8a0fde36b729d8aa04124fe291f97845997d39aeb814dc14558104dfcaa554f61430780eb68860db32f994b44eb35a40cd"

RPROVIDES:${PN} += "libconferenceloggerplugin.so \
psi+-plugins-conferenceloggerplugin"

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
