SUMMARY = "Development headers for Boost.Math libraries"
DESCRIPTION = "Development headers for Boost.Math* boost libraries. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_math-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "52e167cb1e33342ec998fbb1ff9b6fc7293d2da86c22a5ae0d192bb97e65e052fc93b3a26cdfeefe46962719021ef64557724921411a312c9c5668e54236495d"

RPROVIDES:${PN} += "libboost-math-devel"

RDEPENDS:${PN} += "libboost-math1-91-0-devel"

inherit rpm
