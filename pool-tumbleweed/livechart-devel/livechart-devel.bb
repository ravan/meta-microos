SUMMARY = "Development files for livechart"
DESCRIPTION = "Development files for livechart."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "livechart-devel-2.0.0-1.4.aarch64.rpm"
RPM_HASH = "6cd32110f8754a33dbfdb843e6cb530573f4da36f5c3e114b392e3c048dbccd454c1900c144af2b5a1b2593dc05a9bb187243d9475b35f3ea6e0147510fd70c2"

RPROVIDES:${PN} += "livechart-devel \
pkgconfig-livechart-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblivechart-2-2 \
pkgconfig-gee-0.8 \
pkgconfig-gtk4"

inherit rpm
