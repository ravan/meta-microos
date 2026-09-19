SUMMARY = "Development headers for valijson"
DESCRIPTION = "This package provides development headers for valijson, a JSON Schema \
validation library for C++11."
LICENSE = "BSD-2-Clause"

PV = "1.1.3"

RPM_NAME = "valijson-devel-1.1.3-1.2.aarch64.rpm"
RPM_HASH = "2e425dbcf057648eccfc57effaf10ffeee5acb31e8b020149d483b36ee47c297c722d21a18bd27c8b6de97c70cab1419cea904c2324de67d627435bfdd0a36ac"

RPROVIDES:${PN} += "cmake-valijson \
valijson-devel"

RDEPENDS:${PN} += ""

inherit rpm
