SUMMARY = "Development headers for Boost.ProgramOptions library"
DESCRIPTION = "This package contains development headers for Boost.ProgramOptions \
library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_program_options1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "087febff30f74c1aa716fb4acd24df226cb07529e98f227461a077c87c82dd826f0b75d09cee69b23c9062f4ec55d61c1cd74bbc7e9c3c82146b10a7381afd7d"

RPROVIDES:${PN} += "libboost-program-options-devel-impl \
libboost-program-options1-91-0-devel"

RDEPENDS:${PN} += "libboost-coroutine1-91-0-devel \
libboost-headers1-91-0-devel \
libboost-program-options1-91-0"

inherit rpm
