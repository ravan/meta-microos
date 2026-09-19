SUMMARY = "Shared library for sdbus-cpp"
DESCRIPTION = "Shared library files for sdbus-cpp."
LICENSE = "LGPL-2.1-only"

PV = "2.3.1"

RPM_NAME = "libsdbus-c++2-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "e6c52f28f384446e29fd93928572e524d5bf5439cdff1686075f61f08a83a29f3f557817988e93335883ac3cfcb6d77895cf29c545a58a47022d8eca025737b6"

RPROVIDES:${PN} += "libsdbus-c++.so.2 \
libsdbus-c++2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
