SUMMARY = "Development headers for Boost.IOStreans library"
DESCRIPTION = "Boost.IOStreams provides a framework for defining streams, stream \
buffers and IO filters \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_iostreams-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "c63956f8bb929217834c670b229bc3e0a39f4789e21ea1c2aae36f6e7530637a8cdc8914246d8035053fa4586b6646689d685b4228b6c9d037abc1f584fdbe34"

RPROVIDES:${PN} += "libboost-iostreams-devel"

RDEPENDS:${PN} += "libboost-iostreams1-91-0-devel"

inherit rpm
