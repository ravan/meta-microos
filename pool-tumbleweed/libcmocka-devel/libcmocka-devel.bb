SUMMARY = "Development headers for the cmocka library"
DESCRIPTION = "Development headers for the cmocka unit testing library."
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "libcmocka-devel-2.0.2-1.4.aarch64.rpm"
RPM_HASH = "3153b05a67d910e37e6ffc81d3a932cc31df1eb2232bd4e11fb582237c2dd20ef1e16406db8239e4628ecaebc52482743e95d9196b69afd386ff436282b1e486"

RPROVIDES:${PN} += "libcmocka-devel \
pkgconfig-cmocka"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcmocka0 \
pkgconf-pkg-config"

inherit rpm
