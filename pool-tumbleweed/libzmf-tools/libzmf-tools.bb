SUMMARY = "Tools for converting the Zoner ZMF files"
DESCRIPTION = "Tools to work with the Zoner ZMF files, based on librevenge."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libzmf-tools-0.0.2-2.8.aarch64.rpm"
RPM_HASH = "569c3aff2e4f28abfdf6b78318383e303029be634d88ba1a7b4799c7fdc8b995d7f019a82b7dc3a90fed1537132a1039bfe4f4ae2ddb51bf37b66dda1f8b338d"

RPROVIDES:${PN} += "libzmf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libzmf-0.0.so.0"

inherit rpm
