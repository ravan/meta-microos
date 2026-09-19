SUMMARY = "GNUnet library libnss_gns6"
DESCRIPTION = "This package contains the libnss_gns6 library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libnss_gns6-2-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "9b791882c3df0ba5b918fa3b57ab2abb62b65dff57d7acc1d47ede41c3e69a90c109741cfd7a8c2ed98c8746239a1d5d7b377ff5d18c4aaf4bf2c5ecac36dcd6"

RPROVIDES:${PN} += "libnss-gns6-2 \
libnss-gns6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
