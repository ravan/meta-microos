SUMMARY = "Interactive Connectivity Establishment implementation"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE)."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.23"

RPM_NAME = "libnice-0.1.23-2.3.aarch64.rpm"
RPM_HASH = "70a24a1e0169f29c2b1b19b7351860db2925c883ea96cdc8fd4001936145971def6899954e9fe3f931cb214912e004c2f02ca260f79bc3b315c0e38633f0b93b"

RPROVIDES:${PN} += "libnice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30"

inherit rpm
