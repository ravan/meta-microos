SUMMARY = "TCTI pcap interface library"
DESCRIPTION = "A TCTI which prints TPM commands and responses to a file in pcap-ng format. It abstracts the \
details of direct communication with the interface and protocol exposed by the \
daemon hosting the TPM2 reference implementation."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-tcti-pcap0-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "33f14200ad978d4724743cc2b564d8b2a6e8c3d361ab87b49ce1a0c45b7068a29fc479fa206555963fdd34bd74b15ec17a0dd447031ffa0e6664696215cb205b"

RPROVIDES:${PN} += "libtss2-tcti-pcap.so.0 \
libtss2-tcti-pcap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0 \
libtss2-tctildr.so.0"

inherit rpm
