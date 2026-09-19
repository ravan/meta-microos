SUMMARY = "Development files for LibBytesize"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the LibBytesize library."
LICENSE = "LGPL-2.1-only"

PV = "2.12"

RPM_NAME = "libbytesize-devel-2.12-1.6.aarch64.rpm"
RPM_HASH = "70b11b9720c6b41b3c7256cc4572860dd35982dfcd0b72844acc54de4e40c4c11f1dd0448f49680d67fb083cbf3e02d8344835c072a38240fd92b553426d8620"

RPROVIDES:${PN} += "libbytesize-devel \
pkgconfig-bytesize"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbytesize1"

inherit rpm
