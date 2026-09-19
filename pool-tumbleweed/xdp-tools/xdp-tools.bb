SUMMARY = "Utilities and example programs for use with XDP"
DESCRIPTION = "Utilities and example programs for use with XDP"
LICENSE = "GPL-2.0-only"

PV = "1.6.3"

RPM_NAME = "xdp-tools-1.6.3-3.1.aarch64.rpm"
RPM_HASH = "b4fc275c8ea310e14dc14c093f7b8a387cd0202d99d497357adbd83245d3ee2c564400c33db838de550fa1ce98c43568c185d39d4556e6d5501c394388d1add4"

RPROVIDES:${PN} += "xdp-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libpcap.so.1 \
libxdp.so.1 \
libxdp1"

inherit rpm
