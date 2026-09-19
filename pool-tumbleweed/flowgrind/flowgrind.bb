SUMMARY = "Network performance measurement"
DESCRIPTION = "Flowgrind is a tool similar to iperf, netperf to measure throughput and other \
metrics for TCP and other protocols. It features some unique characteristics \
which are of use when exploring the idiosyncrasies of wireless mesh networks."
LICENSE = "GPL-2.0-only"

PV = "0.8.2"

RPM_NAME = "flowgrind-0.8.2-2.3.aarch64.rpm"
RPM_HASH = "852e0792d2bed15308885375f07b31c13620000c7a739e993c327cc60c3750dabb49819f3941793efd029767f09532e9d8aec299bcd2203a4d76f1a6e5cb9720"

RPROVIDES:${PN} += "flowgrind"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6 \
libpcap.so.1 \
libuuid.so.1 \
libxmlrpc-client.so.3 \
libxmlrpc-server-abyss.so.3 \
libxmlrpc-server.so.3 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
