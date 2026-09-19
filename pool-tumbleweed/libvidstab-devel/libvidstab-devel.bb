SUMMARY = "Development files for libvidstab1_2"
DESCRIPTION = "Development (headers and libraries) files for libvidstab1_2."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1"

RPM_NAME = "libvidstab-devel-1.1.1-2.5.aarch64.rpm"
RPM_HASH = "021fc3deb8b7f40070c93973c7fd054ef5f74620bacf69de7192c92a363cf1a9e2ca7c365fc429d6eae666d1af83d0fb8fc797e49204a7a85819061664eeb6e2"

RPROVIDES:${PN} += "libvidstab-devel \
pkgconfig-vidstab"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvidstab1-2"

inherit rpm
