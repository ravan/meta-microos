SUMMARY = "Dynamic runtime library for Ruby"
DESCRIPTION = "Dynamic runtime library for Ruby"
LICENSE = "BSD-2-Clause | Ruby"

PV = "4.0.6"

RPM_NAME = "libruby4_0-4_0-4.0.6-2.1.aarch64.rpm"
RPM_HASH = "c8f199f65f75d3f30bf45d8d24b0543ad871c5c123a72ceba44838f9536f17f6cc2a1e5041d715d34ca8efa86c11327c707db7be549b77b7048f23d684ef59a1"

RPROVIDES:${PN} += "libruby4-0-4-0 \
libruby4.0.so.4.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
