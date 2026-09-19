SUMMARY = "Development files for range-v3"
DESCRIPTION = "Development files for range-v3."
LICENSE = "BSL-1.0"

PV = "0.12.0"

RPM_NAME = "range-v3-devel-0.12.0-1.14.aarch64.rpm"
RPM_HASH = "502dd401f86c3084a728c17b88511deb4f5d4e7529f690b1e577ba825d18b7d121d250095dd896458cd964040097546d8f6b8e4b258d6ac7055e2ce0a4325033"

RPROVIDES:${PN} += "cmake-range-v3 \
range-v3-devel \
range-v3-static"

RDEPENDS:${PN} += ""

inherit rpm
