SUMMARY = "Development files for the homfly library"
DESCRIPTION = "A library to compute the homfly polynomial of a link. \
 \
This subpackage provides the development headers for it."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "1.04"

RPM_NAME = "libhomfly-devel-1.04-1.3.aarch64.rpm"
RPM_HASH = "a7daad068f573582d4e8abcce6cbf566ec89681a40052f5e9d0f5b6da7d673798393fb251c911613817c01c71b6ee66e1e42355067b094efd9e343855bf54166"

RPROVIDES:${PN} += "libhomfly-devel \
pkgconfig-libhomfly"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhomfly0"

inherit rpm
