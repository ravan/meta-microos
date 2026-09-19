SUMMARY = "Development files for libjose"
DESCRIPTION = "The libjose-devel package contains libraries and header files for \
developing applications that use libjose."
LICENSE = "Apache-2.0"

PV = "14"

RPM_NAME = "libjose-devel-14-1.3.aarch64.rpm"
RPM_HASH = "85342d3a0c314440a9806bbf0d7057fee5ed7445099647287e14daabee6e15d0795ec9bf014fb2e17eb8f85e62ad570bfcb3daa04b42d831035880d657dfc0f8"

RPROVIDES:${PN} += "libjose-devel \
pkgconfig-jose"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjose0 \
pkgconfig-jansson \
pkgconfig-libcrypto \
pkgconfig-zlib"

inherit rpm
