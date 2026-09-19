SUMMARY = "Development files for md4c library"
DESCRIPTION = "This package contains development files needed to use md4c."
LICENSE = "MIT"

PV = "0.5.3"

RPM_NAME = "md4c-devel-0.5.3-1.3.aarch64.rpm"
RPM_HASH = "f64e7dfd559a4ee5a51e22d5b691635517cb11b2d665ad8eb25b08540e23b5f6f62909219cdc4bdc335b8df0b9f784ed42141de94eb293aa841eb58bf0f0f8c2"

RPROVIDES:${PN} += "cmake-md4c \
md4c-devel \
pkgconfig-md4c \
pkgconfig-md4c-html"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmd4c0"

inherit rpm
