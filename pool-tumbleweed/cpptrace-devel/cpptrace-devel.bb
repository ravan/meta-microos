SUMMARY = "Development files for cpptrace"
DESCRIPTION = "Headers, pkg-config data, and CMake config files needed to build \
applications that link against cpptrace."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "cpptrace-devel-1.0.4-1.3.aarch64.rpm"
RPM_HASH = "18101224a1087eb9d89d5153e1fdd85f47a969bd64b6b94c90d18faf00fc52f4412aa439c172d21191653595fcc05138a0c43dd7f549f44dffdd6c3a5d0efe6c"

RPROVIDES:${PN} += "cmake-cpptrace \
cpptrace-devel"

RDEPENDS:${PN} += "libcpptrace1 \
pkgconfig-libdwarf \
pkgconfig-libunwind"

inherit rpm
