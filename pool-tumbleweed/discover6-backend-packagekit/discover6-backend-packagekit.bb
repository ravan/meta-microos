SUMMARY = "PackageKit Backend for Discover"
DESCRIPTION = "A plugin for Discover to support management of system packages and repositories \
using PackageKit."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "discover6-backend-packagekit-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "4275efc66818a4c8d533177ebbdd324f1974f38db0c6aa4c5c00bda2984f1c3ceafba53d172631593b9d3237ea99d35d40c97602d8405446f22440d1d1609a2e"

RPROVIDES:${PN} += "discover-backend-packagekit \
discover6-backend-packagekit"

RDEPENDS:${PN} += "AppStream \
PackageKit \
appstream-provider \
discover6 \
ld-linux-aarch64.so.1 \
libAppStreamQt.so.3 \
libDiscoverCommon.so \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Service.so.6 \
libQCoro6Core.so.0 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libmarkdown.so.3 \
libpackagekitqt6.so.2 \
libstdc++.so.6"

inherit rpm
