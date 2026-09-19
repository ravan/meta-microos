SUMMARY = "Header Files and C API Documentation for tkimg"
DESCRIPTION = "Files needed to compile/link C code against tkimg."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "tkimg-devel-2.1.0-1.6.aarch64.rpm"
RPM_HASH = "d51059b7501710388df4d7a30535e3e2f1004e95292b49404175849891349d3458d4ae992180e17f1f907bcd48b8ef37cd022c25f171a7b16cfdfbe1d533fb95"

RPROVIDES:${PN} += "tkimg-devel"

RDEPENDS:${PN} += ""

inherit rpm
