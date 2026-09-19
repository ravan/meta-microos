SUMMARY = "Development files for libdhash"
DESCRIPTION = "A hash table which will dynamically resize to achieve optimal storage & access \
time properties"
LICENSE = "LGPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "libdhash-devel-0.5.0-29.3.aarch64.rpm"
RPM_HASH = "fa787426e24417f7594cd3c823d9fb7441d559fbbc9f02974665acc369ec2063a9b4bf4d766769555ce39f272e70c612fdaee2be4d594f90b24b4010f40ff657"

RPROVIDES:${PN} += "libdhash-devel \
pkgconfig-dhash"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdhash1"

inherit rpm
