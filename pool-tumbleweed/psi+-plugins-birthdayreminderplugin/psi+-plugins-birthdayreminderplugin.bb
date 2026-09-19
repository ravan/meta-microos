SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to show reminders of upcoming birthdays."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-birthdayreminderplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "a4703f8367f528cf21935267a039d509d8c88116dee2a3db0c2460da572711e9c0c7d050e80240426dd238846ef55ddd010dc0001c6d14aaa29dda644a2badf2"

RPROVIDES:${PN} += "libbirthdayreminderplugin.so \
psi+-plugins-birthdayreminderplugin"

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
