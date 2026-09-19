SUMMARY = "A VPN designed for lossy links with build-in FEC"
DESCRIPTION = "A VPN designed for lossy links, with build-in support for Forward Error \
Correction (FEC). This can improve network quality on high-latency lossy links."
LICENSE = "MIT"

PV = "20230206.0"

RPM_NAME = "tinyfecvpn-20230206.0-1.11.aarch64.rpm"
RPM_HASH = "39302f5fec6b8e8e3878b26821e03ed0958b965486b72e5f7eb692834225cf60be5ece8c80a3a8143bf9cad09c2dca5da7b63eaf8e10e728e6553d447838fbd8"

RPROVIDES:${PN} += "tinyfecvpn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
