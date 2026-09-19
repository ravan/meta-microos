SUMMARY = "A C Library for Portable Packet Creation"
DESCRIPTION = "Libnet is an API to help with the construction and handling of network \
packets. It provides a portable framework for low-level network packet \
writing and handling. Libnet includes packet creation at the IP layer \
and at the link layer as well as a host of supplementary and \
complementary functionality. Libnet is very useful for writing network \
tools and network test code. See the man page and sample test code for \
more detailed information."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "libnet9-1.3-1.11.aarch64.rpm"
RPM_HASH = "1892e70e45ac31090275ae3322b3041b377b561276dba809061ee6b57f0480c23d366472025db5db6d3374ef236bf8f3c7329cca44d415298225eb6632ab4d01"

RPROVIDES:${PN} += "libnet.so.9 \
libnet9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
