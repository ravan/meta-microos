SUMMARY = "Development files for libcupsfilters"
DESCRIPTION = "This package contains the development files for libcupsfilters."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "libcupsfilters-devel-2.1.1-2.1.aarch64.rpm"
RPM_HASH = "65a1ed7a477b660601fe4d5565e8c5de0a41c276030b655099719e4653ba69cbc6578696b0e2ba1c033eee5575d85d5897038ba70af22c1812f63460b6cd4728"

RPROVIDES:${PN} += "libcupsfilters-devel \
pkgconfig-libcupsfilters"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcupsfilters \
libcupsfilters2"

inherit rpm
