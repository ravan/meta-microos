SUMMARY = "Plugin for Psi"
DESCRIPTION = "Plugin to add Gomoku game to Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-gomokugameplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "ad87674e1a285fa19a2dbbb5903d116c6e2278ef92dd3812cf3c3c738c50d65447ba2b18a38df302656eb968bcccaf3cb9e0bd7744f570d6bd979b36caed1bb8"

RPROVIDES:${PN} += "libgomokugameplugin.so \
psi+-plugins-gomokugameplugin"

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
