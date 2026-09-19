SUMMARY = "Development files for qbs"
DESCRIPTION = "This package is required to develop applications using qbs as a library"
LICENSE = "LGPL-3.0-only"

PV = "3.3.1"

RPM_NAME = "qbs-devel-3.3.1-1.1.aarch64.rpm"
RPM_HASH = "ac91d1afd85d4aaa6a30b8ebc6ed9d7343bada937f2a40727160d2f26ec0f14f351d732d822fc1b4c99b7abd1d8d1bc5bfb4645bb5cc55e1ed33961f2ef4e57f"

RPROVIDES:${PN} += "qbs-devel"

RDEPENDS:${PN} += "qbs"

inherit rpm
