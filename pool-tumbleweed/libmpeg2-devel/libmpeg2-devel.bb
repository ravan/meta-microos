SUMMARY = "Development files for libmpeg2"
DESCRIPTION = "Include Files and Libraries mandatory for libmpeg2 Development"
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "libmpeg2-devel-0.5.1-3.23.aarch64.rpm"
RPM_HASH = "33cfe31f731035531b07db3dd34872b58e6078776fef362b97bf72d4178fcc65adfdfd2e20b928c09e35d797683f22d0f04011defbee03763a5a512834c91fde"

RPROVIDES:${PN} += "libmpeg2-devel \
pkgconfig-libmpeg2 \
pkgconfig-libmpeg2convert"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpeg2-0 \
libmpeg2convert0"

inherit rpm
