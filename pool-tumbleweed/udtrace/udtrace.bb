SUMMARY = "Unix domain socket tracing"
DESCRIPTION = "This is a LD_PRELOAD wrapper library which can be used to trace the \
data sent and/or received via unix domain sockets. \
 \
Unlike IP based communication that can be captured/traced with pcap \
programs like tcpdump or wireshark, there is no similar mechanism \
available for unix domain sockets. \
 \
This LD_PRELOAD library intercepts the C library function calls of \
dynamically linked programs. It will detect all file descriptors \
representing unix domain sockets and will then print traces of all \
data sent/received via the socket."
LICENSE = "GPL-3.0"

PV = "0.0.0+git.20180402"

RPM_NAME = "udtrace-0.0.0+git.20180402-1.25.aarch64.rpm"
RPM_HASH = "8ee03a34dd226de5cb9cfc5e703752e4ae63f1717054926e0e20691fac06f53d283ea23e2c38022664573cfd4bb7e1417e831fc45b6e6e61d8b2a746383a7764"

RPROVIDES:${PN} += "libudtrace.so \
udtrace"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
