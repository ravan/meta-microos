SUMMARY = "Development files for libplayerctl"
DESCRIPTION = "This package provides libraries and headers for developing applications that \
use libplayerctl."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "playerctl-devel-2.4.1-1.21.aarch64.rpm"
RPM_HASH = "9dc306c410e16844b7335d414b7f40592a7b8137875e574236ee971b14805fe10bd9328b0938f6804507010923a7ee001706e71a5fd58cb594dea71ed424bc8a"

RPROVIDES:${PN} += "pkgconfig-playerctl \
playerctl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplayerctl2 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
