SUMMARY = "Simple DirectMedia Layer 3 – Networking library"
DESCRIPTION = "This is a networking library for use with SDL."
LICENSE = "Zlib"

PV = "3.2.0"

RPM_NAME = "libSDL3_net0-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "9f7c32619d35645744b3ca2237ee4846d90276fb6e70dc4092b3fac39bd8d30941be99d2021a86fd57b9da403889cae79302565c2b4dbaf5d3575bc47261312b"

RPROVIDES:${PN} += "SDL3-net \
libSDL3-net.so.0 \
libSDL3-net0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libc.so.6"

inherit rpm
