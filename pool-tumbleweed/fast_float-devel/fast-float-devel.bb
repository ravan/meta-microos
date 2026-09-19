SUMMARY = "Development and header files for fast_float"
DESCRIPTION = "The fast_float library provides fast header-only implementations for the C++ \
from_chars functions for float and double types as well as integer types."
LICENSE = "Apache-2.0 | BSL-1.0 | MIT"

PV = "8.2.10"

RPM_NAME = "fast_float-devel-8.2.10-1.3.noarch.rpm"
RPM_HASH = "0070f7b5640a76dbe0ec8d1a51eb2d3aa820c505d5a372461ecd98021b089ac354c871994621fca9bfc549f396fbc17729195f469f9e8ac865db3967cb73305b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-FastFloat \
fast-float-devel"

RDEPENDS:${PN} += ""

inherit rpm
