SUMMARY = "Development headers for Boost.Fiber library"
DESCRIPTION = "This package contains development header files and libraries for \
Boost.Fiber library. Boost.Fiber is a cooperative multi-tasking \
userland threading library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_fiber-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "cae90aa7cdf894be36d53afe8fa87bc9d6ab55a8aa2152d447dbefb506a139a1cb7ad7b952ddb6a9b9339a8dc03e3700bc2e1f6b462ca045271fcb423cee03cc"

RPROVIDES:${PN} += "libboost-fiber-devel"

RDEPENDS:${PN} += "libboost-fiber1-91-0-devel"

inherit rpm
