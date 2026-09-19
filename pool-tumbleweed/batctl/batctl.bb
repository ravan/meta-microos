SUMMARY = "B.A.T.M.A.N. advanced control and management tool"
DESCRIPTION = "Why do I need batctl?  B.A.T.M.A.N. advanced operates on layer 2 and \
thus all hosts participating in the virtual switch are completely \
transparent for all protocols above layer 2.  Therefore the common \
diagnosis tools do not work as expected.  To overcome these problems \
batctl was created.  At the moment batctl contains ping, traceroute, \
tcpdump and interfaces to the kernel module settings."
LICENSE = "GPL-2.0-only & MIT"

PV = "2025.3"

RPM_NAME = "batctl-2025.3-1.6.aarch64.rpm"
RPM_HASH = "6b393c317482cd2045a81fc7f902c5edaf8d008c3a419a8a9204668918e731e06ea5f4dd8ffac1a023f769ee87f2ec1c2fe1f0479e8b2a979c51998b27527729"

RPROVIDES:${PN} += "batctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
