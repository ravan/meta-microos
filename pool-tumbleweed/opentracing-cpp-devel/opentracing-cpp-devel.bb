SUMMARY = "Development files for the OpenTracing C++ API"
DESCRIPTION = "Development files for opentracing-cpp - the C++ implementation of the \
OpenTracing API."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "opentracing-cpp-devel-1.6.0-1.20.aarch64.rpm"
RPM_HASH = "275df6df0f21882ef57436cc89e9fe21c7b93843008bc53876cc8070ac7349607f5829e6a5ebf62e261e20fcf5473e605f108c8dcf345441b237a9bf62e6759b"

RPROVIDES:${PN} += "opentracing-cpp-devel"

RDEPENDS:${PN} += "libopentracing-cpp1"

inherit rpm
