SUMMARY = "OpenTracing C++ API"
DESCRIPTION = "C++ implementation of the OpenTracing API."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libopentracing-cpp1-1.6.0-1.20.aarch64.rpm"
RPM_HASH = "a9b2bba2260c1876fe551ac34e0bcab6e51e624648cf7889dc56f339e8e29d3004495aafab50a5a9df4383fe0af032ca094f7e1ba461b3e6533d358104b5cad8"

RPROVIDES:${PN} += "cmake-OpenTracing \
libopentracing-cpp1 \
libopentracing-mocktracer.so.1 \
libopentracing.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
