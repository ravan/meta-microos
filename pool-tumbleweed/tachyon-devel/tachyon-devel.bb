SUMMARY = "Development files for the Tachyon Ray Tracing System"
DESCRIPTION = "A parallel ray tracing system supporting MPI and multithreaded \
implementations. \
 \
This package contains the headers for the Tachyon library."
LICENSE = "BSD-3-Clause"

PV = "0.99.5"

RPM_NAME = "tachyon-devel-0.99.5-1.16.aarch64.rpm"
RPM_HASH = "95ab5924d9a949bf4dc07b9df058f6c7d3faa32400e16171f859c151fab352bb894face6745f49f16fba85e88e5acb9425a586ddf647399e478ad58de1cbd71b"

RPROVIDES:${PN} += "libtachyon-devel \
tachyon-devel"

RDEPENDS:${PN} += "libtachyon-0-99-5"

inherit rpm
