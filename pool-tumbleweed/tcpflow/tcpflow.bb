SUMMARY = "Program for capturing and collecting TCP streams"
DESCRIPTION = "tcpflow is a program that captures data transmitted as part of TCP connections \
(flows), and stores the data in a way that is convenient for protocol \
analysis and debugging. Each TCP flow is stored in its own file. Thus, the \
typical TCP flow will be stored in two files, one for each direction. \
tcpflow can also process stored 'tcpdump' packet flows."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.1"

RPM_NAME = "tcpflow-1.6.1-2.21.aarch64.rpm"
RPM_HASH = "241b6eb4aaf804dfb365e8f8a3ec67be99d43be5d6b65111ec63d0dcf9132363c5a06449b607fb13af37de539ac7c1ec5f7954014ba067af6aa94d79030a4644"

RPROVIDES:${PN} += "tcpflow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libpcap.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
