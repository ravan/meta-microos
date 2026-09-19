SUMMARY = "Infiniband Unified Communication Protocols"
DESCRIPTION = "High-level API uses UCT framework to construct protocols commonly \
found in applications (MPI, OpenSHMEM, PGAS, etc.)"
LICENSE = "BSD-3-Clause"

PV = "1.21.0"

RPM_NAME = "libucp0-1.21.0-1.2.aarch64.rpm"
RPM_HASH = "91b74ce6dd05bc1047bafd4b3b9506974d1173ad562f10d0c07745f42d6ca57d1aa3a058090869df045636ed6161f52a453f64e4d5cbb54dd4a9c790ffa1bfcb"

RPROVIDES:${PN} += "libucp.so.0 \
libucp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libucs.so.0 \
libuct.so.0"

inherit rpm
