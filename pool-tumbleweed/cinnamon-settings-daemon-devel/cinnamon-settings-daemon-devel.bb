SUMMARY = "The settings Daemon for the Cinnamon Desktop -- Development Files"
DESCRIPTION = "This package contains the settings Daemon for the Cinnamon Desktop. \
 \
This package contains development files for cinnamon-settings-daemon."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "6.4.3"

RPM_NAME = "cinnamon-settings-daemon-devel-6.4.3-2.4.aarch64.rpm"
RPM_HASH = "7ef413b156bf44497cf557dde71174238d4ac36b097bef63c03d3d2d9d2ab4d96db12ec5a471f2563d4fdcbed0c160d43702fc60dea521ce92442bd86bcfb26d"

RPROVIDES:${PN} += "cinnamon-settings-daemon-devel \
pkgconfig-cinnamon-settings-daemon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cinnamon-settings-daemon \
pkgconfig-glib-2.0"

inherit rpm
