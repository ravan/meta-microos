SUMMARY = "EFA runtime library"
DESCRIPTION = "This package contains the efa runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "libefa1-63.0-1.3.aarch64.rpm"
RPM_HASH = "604e6e4de633e8dfe2225ce01e18029e6c89ba3785ad8c389612ddd23bf877ff7bfeae11cdf9343bbc0a78128860fda14e71335f26c3d7dcaa65965e21e9032c"

RPROVIDES:${PN} += "libefa.so.1 \
libefa1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
