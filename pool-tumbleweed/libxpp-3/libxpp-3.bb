SUMMARY = "An object oriented C++ wrapper for parts of the X11 API"
DESCRIPTION = "A library providing an object oriented C++ API wrapper for parts of the X11 \
API. \
 \
The runtime library files for libxpp."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "libxpp-3-0.3.3-1.3.aarch64.rpm"
RPM_HASH = "26211f4d67575288dd6d88023f9ea4392a0f422f07c39efe78b3d4b19c63b6c5488b7698ebe65c972873023a10f0aa205c5df5e9893f6414cb5e070ddc3b639a"

RPROVIDES:${PN} += "libxpp \
libxpp-0-2-0 \
libxpp-3 \
libxpp.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libX11.so.6 \
libc.so.6 \
libcosmos.so.4 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
