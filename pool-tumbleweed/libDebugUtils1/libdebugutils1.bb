SUMMARY = "Debug Utils Library for Recastnavigation"
DESCRIPTION = "This package contains the debug utilities library for the recastnavigation."
LICENSE = "Zlib"

PV = "1.6.0"

RPM_NAME = "libDebugUtils1-1.6.0-1.9.aarch64.rpm"
RPM_HASH = "bde7aabd6062aabd1674df9e1fcb59cf46248865aa1b735c1ec84415df8a24c741dae4d5630fdb24d2298e282291ca8f549307b6a5f20e7944aa909b813213f6"

RPROVIDES:${PN} += "libDebugUtils.so.1 \
libDebugUtils1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libDetour.so.1 \
libRecast.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
