SUMMARY = "Development files for partio"
DESCRIPTION = "The partio-devel package contains libraries and header files for \
developing applications that use partio."
LICENSE = "BSD-3-Clause"

PV = "1.20.0"

RPM_NAME = "partio-devel-1.20.0-1.4.aarch64.rpm"
RPM_HASH = "136fe6a14c3a793bed9b05bff50d0c1e6b358ae09b6ff467ddeff7edd65f0fb96790cedc26d428568fa1aa2633f5dec9413eba3bb1f069d36225e139617dc508"

RPROVIDES:${PN} += "partio-devel"

RDEPENDS:${PN} += "libpartio1"

inherit rpm
