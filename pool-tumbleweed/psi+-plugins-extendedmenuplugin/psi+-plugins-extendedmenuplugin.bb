SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin adds more options to contact's menus."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-extendedmenuplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "bb78f3a26b1cfa43bafdf53064a6d58a755712c7faa05dc75460227d446a256adc2ca1a7af299228b3a5fe2e3175e468c8bdce5a660856e26e21d3edbd5e873d"

RPROVIDES:${PN} += "libextendedmenuplugin.so \
psi+-plugins-extendedmenuplugin"

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
