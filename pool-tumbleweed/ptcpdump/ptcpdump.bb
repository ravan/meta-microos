SUMMARY = "Process-aware, eBPF-based tcpdump"
DESCRIPTION = "ptcpdump is an eBPF-based implementation of tcpdump that includes an additional \
feature: it adds process information as comments for each packet when available"
LICENSE = "BSD-3-Clause"

PV = "0.37.0"

RPM_NAME = "ptcpdump-0.37.0-1.10.aarch64.rpm"
RPM_HASH = "a453a238a209929200904ab2d8bb04e00f58a3329875f270c5be2e8ee25b21cb90722ffbe40ac66bdfcf3504478fdbdba00ab4f69b1d5e5ce3d2439c7ad2625b"

RPROVIDES:${PN} += "ptcpdump"

RDEPENDS:${PN} += "libpcap1"

inherit rpm
