SUMMARY = "Development files for libmseed"
DESCRIPTION = "The miniSEED library provides a framework for manipulation of miniSEED records, \
a format commonly used for seismological time series and related data. The \
library includes the functionality to read and write data records, in addition \
to reconstructing time series from multiple records. \
 \
This package contains files required for building using libmseed."
LICENSE = "Apache-2.0"

PV = "3.5.4"

RPM_NAME = "libmseed-devel-3.5.4-1.1.aarch64.rpm"
RPM_HASH = "c62c47ecfba7a968b2de7d9d3091ebe0282bf4397568e46bf2c9cadaecfa10b7c2c06e553569407615e40d6256775cc39a69e15a1a87a0a97561528fba220c65"

RPROVIDES:${PN} += "libmseed-devel \
pkgconfig-mseed"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmseed3"

inherit rpm
