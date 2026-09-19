SUMMARY = "Development headers for Boost.Log library"
DESCRIPTION = "Development headers for Boost.Log library which aims to make logging \
significantly easier for the application developer. It provides a wide \
range of out-of-the-box tools along with public interfaces for extending \
the library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_log-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "f4e25cf16fe8e07a5dbb583ca41c89dc856e051e86146781b3e04c2ef51d052b203c0df42a921f5bf642677829cb45ae1f354e06f114f3fd757408ef07265d88"

RPROVIDES:${PN} += "libboost-log-devel"

RDEPENDS:${PN} += "libboost-log1-91-0-devel"

inherit rpm
