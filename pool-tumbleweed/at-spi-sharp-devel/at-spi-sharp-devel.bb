SUMMARY = "Development package for at-spi-sharp mono bindings"
DESCRIPTION = "Development package that contains the pkgconfig file for at-spi-sharp."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "at-spi-sharp-devel-1.1.1-3.5.noarch.rpm"
RPM_HASH = "bc819a97b6fc58f95b5ed557498b2bbbd680a750067bce46bb92937cee505fa05f9e4a0e5257fdc3903d32c37e87b91e700b4328ab1528d050a5adf5320b610f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "at-spi-sharp-devel \
pkgconfig-at-spi-sharp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
at-spi-sharp"

inherit rpm
