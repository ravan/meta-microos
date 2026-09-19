SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin is designed to allow easy configuration of some advanced options in \
Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-extendedoptionsplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "84072c9fb575bc4725ff467ec0c70fb202d1dbeb6c825992ea5f000001cca3fab9f9111fcfc0bfcd418b09fc8d49cc172b96f377514fe1ace0f2a04637aad487"

RPROVIDES:${PN} += "libextendedoptionsplugin.so \
psi+-plugins-extendedoptionsplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
