SUMMARY = "Development files for xrdp"
DESCRIPTION = "This package contains the development headers for xrdp."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.10.6.1"

RPM_NAME = "xrdp-devel-0.10.6.1-1.1.aarch64.rpm"
RPM_HASH = "5211a7e911e5d906035989893ce056f4e8060495d9c44845cdd38603c110f95881d6d1814d1091bfd91e6f43513cf467e1b4ccc59cfd5b34b98d32cde46cb680"

RPROVIDES:${PN} += "pkgconfig-rfxcodec \
pkgconfig-xrdp \
xrdp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
