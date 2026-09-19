SUMMARY = "Manual pages for cmake, a cross-platform make system"
DESCRIPTION = "Manual pages for cmake, a cross-platform make system."
LICENSE = "BSD-3-Clause"

PV = "4.4.3"

RPM_NAME = "cmake-man-4.4.3-1.1.aarch64.rpm"
RPM_HASH = "7f4f1cf3cee4d9933b1b877ee682532d30244d45df978f62992e9cc72355c9a40361c5083799b44f1c00a6b150a005c74204f1bf3f49ec9e536af63912fc5a3c"

RPROVIDES:${PN} += "cmake-man"

RDEPENDS:${PN} += ""

inherit rpm
