SUMMARY = "Flatpak-free launcher for the Cockpit GTK client"
DESCRIPTION = "cockpit-client-launcher provides a desktop launcher for the Cockpit GTK client without \
requiring Flatpak. It connects to the locally installed cockpit-ws service \
and automatically detects the configured listening port from cockpit.socket."
LICENSE = "LGPL-2.1-or-later"

PV = "361"

RPM_NAME = "cockpit-client-launcher-361-1.2.noarch.rpm"
RPM_HASH = "ba2aa856086ce37520e38b475f6564d1f6615de3ddda063dbd7c207eebd1883c28adc7830a3b9ea1ef44d607b77e3ccb41052edcb1fdf8346f381a645affa69a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-client-launcher"

RDEPENDS:${PN} += "/usr/bin/bash \
cockpit-system \
cockpit-ws \
libwebkit2gtk4 \
typelib-1-0-Adw-1 \
typelib-1-0-WebKit-6-0 \
zenity"

inherit rpm
