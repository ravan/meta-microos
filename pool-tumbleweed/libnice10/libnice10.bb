SUMMARY = "Interactive Connectivity Establishment implementation"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE)."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.23"

RPM_NAME = "libnice10-0.1.23-2.3.aarch64.rpm"
RPM_HASH = "d21525d2fb5f574471e7b77b4860090caa035ceb9b811ea45bdb122917decc8bae2d70f2de6d1cde0d3d4bc1972aaa73f90fe260e9992726ef1ecc6966398122"

RPROVIDES:${PN} += "libnice.so.10 \
libnice10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgupnp-igd-1.6.so.0"

inherit rpm
