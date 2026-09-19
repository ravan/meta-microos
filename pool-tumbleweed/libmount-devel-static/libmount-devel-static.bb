SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libmount-devel-static-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "ee1fe8acc6ef36cc845d8fb8ce2b87c92dea25d66f71ebcdc0a100e9bb9dd48893607fc01ed4f10065c814d0faf370e4b3719b76889fa4360d9bc442be113943"

RPROVIDES:${PN} += "libmount-devel-static"

RDEPENDS:${PN} += "libblkid-devel-static \
libmount-devel"

inherit rpm
