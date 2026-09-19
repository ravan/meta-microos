SUMMARY = "Network throughput and latency measurement tool"
DESCRIPTION = "Iperf here is a means of measuring networks - capacity & latency (including \
dual queue L4S) over sockets both TCP and UDP."
LICENSE = "NCSA"

PV = "2.2.1"

RPM_NAME = "iperf2-2.2.1-1.8.aarch64.rpm"
RPM_HASH = "a19da4eee2eade5dce04f3dc61571693ad04e967172c74391cd84af2e7c12e40fa32febae3510a44a25309a8a76497b29c84ce855a617c8b999579f266fcd40e"

RPROVIDES:${PN} += "iperf2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
