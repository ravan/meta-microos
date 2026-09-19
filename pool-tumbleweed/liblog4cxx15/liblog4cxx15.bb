SUMMARY = "Log4j like C++ Logging Library"
DESCRIPTION = "Log4cxx is a port to C++ of the log4j logging library."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "liblog4cxx15-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "32d561b19a8ddb12c9ac7273b5ab8a9932f9db6143659e18eb55b7ab6f820bc3854992c3d8e35d3b00bad3ce5943b0c28ddae859ba120040a23ad4983c11e144"

RPROVIDES:${PN} += "liblog4cxx.so.15 \
liblog4cxx15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
