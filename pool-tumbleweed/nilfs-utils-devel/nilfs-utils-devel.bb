SUMMARY = "Development package for the libnilfs library"
DESCRIPTION = "This package contains the development files for NILFS v2."
LICENSE = "GPL-2.0-only"

PV = "2.3.1"

RPM_NAME = "nilfs-utils-devel-2.3.1-2.3.aarch64.rpm"
RPM_HASH = "ab8be6a5e410f88d006cb0f1050d83c2952354da6e8e68d0c4fcdd90dea9f1188a9b9d5fd36744886d816889878a11a82138ed7a33a5e0659bd0d192566ed159"

RPROVIDES:${PN} += "nilfs-utils-devel \
pkgconfig-nilfs \
pkgconfig-nilfsgc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnilfs3 \
pkgconfig-nilfs"

inherit rpm
