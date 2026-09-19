SUMMARY = "Development files for liblightgrep"
DESCRIPTION = "Development files for liblightgrep, a regex engine designed for digital forensics. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblightgrep."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4"

RPM_NAME = "liblightgrep-devel-1.4-7.6.aarch64.rpm"
RPM_HASH = "8720fa3989f599c2083d4f9cde2d8ef33a29b18152f37059108e1da74a640e2f737f54503848a9fba96120682000f060938ea7ceede2bb2ff9cb17341b9ddc2d"

RPROVIDES:${PN} += "liblightgrep-devel \
pkgconfig-lightgrep"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblightgrep0 \
pkgconfig-icu-uc"

inherit rpm
