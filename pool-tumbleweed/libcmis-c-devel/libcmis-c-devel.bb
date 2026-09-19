SUMMARY = "Development files for libcmis-c"
DESCRIPTION = "Development files for libcmis-c. libcmis-c is a C client library for \
the CMIS interface."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.6.2"

RPM_NAME = "libcmis-c-devel-0.6.2-3.16.aarch64.rpm"
RPM_HASH = "e574d4240a7b10ff979291838c0193f6fd7b0b103ab2c95f46b9bbf6f1052257987f5abaf305a490e225fc274d4a2debbf986ca51e84226ff3d058b357a7d334"

RPROVIDES:${PN} += "libcmis-c-devel \
pkgconfig-libcmis-c-0.6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcmis-c-0-6-6 \
pkgconfig-libcmis-0.6 \
pkgconfig-libcurl \
pkgconfig-libxml-2.0"

inherit rpm
