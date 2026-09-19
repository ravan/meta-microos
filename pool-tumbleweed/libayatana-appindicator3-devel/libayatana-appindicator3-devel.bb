SUMMARY = "Development files for libayatana-appindicator3"
DESCRIPTION = "This package contains the development files for the ayatana \
appindicator3 library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.93"

RPM_NAME = "libayatana-appindicator3-devel-0.5.93-3.4.aarch64.rpm"
RPM_HASH = "28a9b51fcabdd512e0c98f2185db57c6f2160e0f5fee165e8bbda289fac0764a4f540f57edad010fc23bbeedad9a163db7f751eda7f2fbe934643acd6a95b7e0"

RPROVIDES:${PN} += "libayatana-appindicator3-devel \
pkgconfig-ayatana-appindicator3-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libayatana-appindicator3-1 \
pkgconfig-ayatana-indicator3-0.4 \
pkgconfig-dbusmenu-glib-0.4 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
