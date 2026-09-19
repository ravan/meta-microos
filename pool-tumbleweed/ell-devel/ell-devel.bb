SUMMARY = "Development files for the ELL wireless setup/crypto library"
DESCRIPTION = "The 'Embedded Linux Library' implements an API for wireless \
cryptography actions by using the kernel crypto API. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of ell."
LICENSE = "LGPL-2.1-or-later"

PV = "0.83"

RPM_NAME = "ell-devel-0.83-1.3.aarch64.rpm"
RPM_HASH = "600c6d317c6de51ab067bf0e4084e838947fff858101d1c77b3c235836e931827b203390f8cc88b95c3375a0c0a91a23be41770b0fe96a827f35d4c65f67d4ba"

RPROVIDES:${PN} += "ell-devel \
pkgconfig-ell"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libell0"

inherit rpm
