SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to clear the avatar cache, saved local copies of vCards \
and history logs."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-cleanerplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "8dae40f82d27e1efc179bc052bd7ac8b180a7e5e0fc32cfa0d2b58d6ee2b89ff3604f76b22d28e424ef458e64ab1ee59b7aca8cf4625d3b2adf514c51fc47a57"

RPROVIDES:${PN} += "libcleanerplugin.so \
psi+-plugins-cleanerplugin"

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
