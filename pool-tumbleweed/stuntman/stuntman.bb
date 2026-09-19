SUMMARY = "STUN server and client"
DESCRIPTION = "An implementation of the STUN protocol (Session Traversal Utilities \
for NAT) as specified in RFCs 5389, 5769, and 5780. It also includes \
backwards compatibility for RFC 3489. \
This package provides an STUN server and client application."
LICENSE = "Apache-2.0"

PV = "1.2.16"

RPM_NAME = "stuntman-1.2.16-2.21.aarch64.rpm"
RPM_HASH = "1e9bd2308e0d19ce225318fbb4492baee364225bd1c5718bf8f1b57438ef0df39da441ceef12747028fa657ebc73747232914934f3d7193f3bdf8c4cdca20a06"

RPROVIDES:${PN} += "stuntman"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
shadow"

inherit rpm
