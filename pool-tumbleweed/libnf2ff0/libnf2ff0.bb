SUMMARY = "Near-field to far-field transformation library"
DESCRIPTION = "Near-field to far-field transformation library."
LICENSE = "GPL-3.0-only"

PV = "0.0.36"

RPM_NAME = "libnf2ff0-0.0.36-4.8.aarch64.rpm"
RPM_HASH = "55d3ed2a91d63e0f2160d922798321c2a1218b0d1876a0087210c2e9c4ae98a0d93882527a7be21a50062f59de3e6e9db0a3905dd07ed5c876984711cb798b10"

RPROVIDES:${PN} += "libnf2ff.so.0 \
libnf2ff0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.310 \
libm.so.6 \
libstdc++.so.6 \
libtinyxml.so.0"

inherit rpm
