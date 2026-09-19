SUMMARY = "Libraries and header files for libndp development"
DESCRIPTION = "The libndp-devel package contains the header files necessary for developing \
programs using libndp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9"

RPM_NAME = "libndp-devel-1.9-1.2.aarch64.rpm"
RPM_HASH = "4ad1d521a022642b4b51e2db9b56bf776a1813c3507475672010af773aa707cf06a1d3875c653d324af1602e014d8b5afd70cb1f1920522c62ca635cd7ceebc7"

RPROVIDES:${PN} += "libndp-devel \
pkgconfig-libndp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libndp0"

inherit rpm
