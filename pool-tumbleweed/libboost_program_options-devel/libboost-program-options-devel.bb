SUMMARY = "Development headers for Boost.ProgramOptions library"
DESCRIPTION = "This package contains development headers for Boost.ProgramOptions \
library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_program_options-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "507aee37c2264c6ce03f294085a34b2377b0b7d312bb07ecf7617f0ab067eab5f649a3e57ed362a01e1b350548704f0ee767f7976e46a1cb967fa7c269ebdc91"

RPROVIDES:${PN} += "libboost-program-options-devel"

RDEPENDS:${PN} += "libboost-program-options1-91-0-devel"

inherit rpm
