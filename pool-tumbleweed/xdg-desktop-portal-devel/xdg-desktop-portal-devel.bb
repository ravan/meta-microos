SUMMARY = "A portal frontend service for Flatpak -- Development files"
DESCRIPTION = "A portal frontend service for Flatpak and possibly other desktop containment frameworks. \
 \
xdg-desktop-portal works by exposing a series of D-Bus interfaces known as portals under \
a well-known name (org.freedesktop.portal.Desktop) and object path (/org/freedesktop/portal/desktop). \
 \
This package contains convenience files for developers."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.1"

RPM_NAME = "xdg-desktop-portal-devel-1.22.1-1.2.aarch64.rpm"
RPM_HASH = "de5d53e06ee1c107053a6f5158c8010183b45eb2ddbc6e4ef7e721fd6a546f99aa8b9df8d5a75aab7f5939f00f549db93cfc40515523e571511fc443466b2f90"

RPROVIDES:${PN} += "pkgconfig-xdg-desktop-portal \
xdg-desktop-portal-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
xdg-desktop-portal"

inherit rpm
