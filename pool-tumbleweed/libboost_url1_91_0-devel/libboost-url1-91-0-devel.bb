SUMMARY = "Development headers for Boost.URL library"
DESCRIPTION = "This package contains development headers for Boost.URL library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_url1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "560e3fd6e87aa2f3ea8092813aa257184f6e02683e4696efe41f1212ff864c8fd22126a1f3a52df4e10a80f83952b811d532ac6962645bc53c1ecbc9023e1fd1"

RPROVIDES:${PN} += "libboost-url-devel-impl \
libboost-url1-91-0-devel"

RDEPENDS:${PN} += "libboost-url1-91-0"

inherit rpm
