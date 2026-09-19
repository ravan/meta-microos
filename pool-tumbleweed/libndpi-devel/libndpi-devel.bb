SUMMARY = "Development headers for nNDPI"
DESCRIPTION = "nDPI is a ntop-maintained superset of the OpenDPI library. It extends \
the original library by adding new protocols that are otherwise \
available only on the paid version of OpenDPI. \
 \
This package contains the Development headers for libndpi."
LICENSE = "LGPL-3.0-only"

PV = "4.12"

RPM_NAME = "libndpi-devel-4.12-1.8.aarch64.rpm"
RPM_HASH = "8bb21ebce6907ebeb7cad3a280beab592c480aee2529c5265ca08a3d2e5eb6e026e84baad3a23067e31cdbef9df638c64021b0c7be7cce0a4c17ecc52891af28"

RPROVIDES:${PN} += "libndpi-devel \
pkgconfig-libndpi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libndpi4"

inherit rpm
