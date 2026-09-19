SUMMARY = "Development libraries and headers for SimGear"
DESCRIPTION = "Development headers and libraries for building applications against \
SimGear."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later & MIT"

PV = "2024.1.7"

RPM_NAME = "SimGear-devel-2024.1.7-1.1.aarch64.rpm"
RPM_HASH = "4741fa8c8c2f484bc4df7beb6936abe43be631bae7e281be1a8c0aafb47d18a880d753302e84615e3b6d1416d5e636da1ac42cc85ff306cf9a9b651b365084c6"

RPROVIDES:${PN} += "SimGear-devel \
cmake-SimGear"

RDEPENDS:${PN} += "libOpenSceneGraph-devel \
libSimGearCore-2024-1-7 \
pkgconfig-liblzma \
pkgconfig-openal \
pkgconfig-zlib \
udns-devel"

inherit rpm
