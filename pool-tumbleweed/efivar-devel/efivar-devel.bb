SUMMARY = "Development headers for libefivar"
DESCRIPTION = "Development headers required to use libefivar."
LICENSE = "LGPL-2.1-only"

PV = "38"

RPM_NAME = "efivar-devel-38-3.9.aarch64.rpm"
RPM_HASH = "423dc0301c701a2285ad9f6c132ab63d10fb4e0469f8c09b36f3e0bb5670e82a5638ae1edb565ec5154af79fd0e63205ae542a070e8e11ec8d0010861f4b9b65"

RPROVIDES:${PN} += "efivar-devel \
pkgconfig-efiboot \
pkgconfig-efisec \
pkgconfig-efivar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libefivar1 \
pkgconfig-efivar"

inherit rpm
