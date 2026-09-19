SUMMARY = "Flatpak Backend for Discover"
DESCRIPTION = "A plugin for Discover to support installation and management of Flatpak \
applications and repositories."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "discover6-backend-flatpak-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "f01c8ea9ce748ed1790acc520dfab57cf4f87613a89e585f55e2933b9d2f99124d87f46d1b637e1e349d938ddb911219bc599f174376b58d3ab907c05776df7f"

RPROVIDES:${PN} += "discover-backend-flatpak \
discover6-backend-flatpak"

RDEPENDS:${PN} += "discover6 \
flatpak \
ld-linux-aarch64.so.1 \
libAppStreamQt.so.3 \
libDiscoverCommon.so \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOGui.so.6 \
libKF6Service.so.6 \
libQCoro6Core.so.0 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libflatpak.so.0 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
