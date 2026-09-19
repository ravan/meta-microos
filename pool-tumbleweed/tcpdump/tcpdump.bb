SUMMARY = "A Packet Sniffer"
DESCRIPTION = "This program can 'read' all or only certain packets going over the \
ethernet. It can be used to debug specific network problems."
LICENSE = "BSD-3-Clause"

PV = "4.99.6"

RPM_NAME = "tcpdump-4.99.6-1.4.aarch64.rpm"
RPM_HASH = "a51341c9d9ead4d82e5a5516d9e912d2eae798fcc67c663579bdb7ae8f6d4cb69c37d5614050e37a8dcbd09c8f9ecff7fac012f8d7eb0aa869447e721e265dbd"

RPROVIDES:${PN} += "tcpdump"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcap \
libpcap.so.1 \
libsmi.so.2"

inherit rpm
