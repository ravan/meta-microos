SUMMARY = "Development headers for Boost.JSON library"
DESCRIPTION = "This package contains development headers for Boost.JSON library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_json-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "8891e1e080d34aae6f32fcd224a4e6c30e7bfde5e83109aae388f62c8229471c175cdd165f2f25cc544943c2506ea084f1a5d28fc621017134fb3701fbc7f0e8"

RPROVIDES:${PN} += "libboost-json-devel"

RDEPENDS:${PN} += "libboost-json1-91-0-devel"

inherit rpm
