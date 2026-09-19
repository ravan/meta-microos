SUMMARY = "Development files for google benchmark"
DESCRIPTION = "Development files for google benchmark library"
LICENSE = "Apache-2.0"

PV = "1.9.5"

RPM_NAME = "benchmark-devel-1.9.5-2.3.aarch64.rpm"
RPM_HASH = "a869e75e1217b665785ee7cfde97862eb5d14556e993e0ffd70101844a848b007b42efc658db7a88f6abd7cfbfceded517903f3bc024455711d8d3d64e5e09da"

RPROVIDES:${PN} += "benchmark-devel \
cmake-benchmark \
pkgconfig-benchmark \
pkgconfig-benchmark-main"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbenchmark1 \
pkgconfig-benchmark"

inherit rpm
