SUMMARY = "Development files for libzbc, a ZBC/ZAC disk manipulation library"
DESCRIPTION = "libzbc is a simple library providing functions for manipulating Zoned \
Block Command (ZBC), Zoned-device ATA command set (ZAC) disks. \
 \
This subpackage contains the files needed to build against libzbc."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "libzbc-devel-6.2.0-1.9.aarch64.rpm"
RPM_HASH = "52e0232b1978b510e36b9bafdbc5d75dd76eddbf4c7d7bea4c7c1fba183a758fa175e711f46a2bb5b063f468d928b700ffe81a67d3796c0e5f551cd8ec032b52"

RPROVIDES:${PN} += "libzbc-devel \
pkgconfig-libzbc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzbc6"

inherit rpm
