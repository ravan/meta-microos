SUMMARY = "Tool to measure socket and RDMA performance"
DESCRIPTION = "qperf measures bandwidth and latency between two nodes. It can work \
over TCP/IP as well as the RDMA transports."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "0.4.11"

RPM_NAME = "qperf-0.4.11-1.22.aarch64.rpm"
RPM_HASH = "7ac62dc2f8e8c83162cf3f87962e7313d4ff60b6f52c4febb5edd06fa057d9576efddd355ac52ef01c3023f0123f542a3c8db405c2cb4b197d05c54ed370cdf3"

RPROVIDES:${PN} += "qperf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
librdmacm.so.1"

inherit rpm
