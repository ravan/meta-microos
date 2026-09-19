SUMMARY = "Package provides recommended R-cluster"
DESCRIPTION = "This packages provides R-cluster, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.1.8.2"

RPM_NAME = "R-cluster-2.1.8.2-58.3.aarch64.rpm"
RPM_HASH = "f59b8cdeb1da8572a6c0ac29c1a2c522994fc995021afa8326e54c2fc728d97eed9faa569eb64d4a9cf393f467daa273dd42786e38fe1b3b518d8c55a2e17f5e"

RPROVIDES:${PN} += "R-cluster"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
