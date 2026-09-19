SUMMARY = "A Common C++ Class Framework for RTP Packets"
DESCRIPTION = "The ccrtp package offers a generic framework for sending and receiving \
real-time streaming data over UDP packets using sending and receiving \
packet queues."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.1.2"

RPM_NAME = "libccrtp3-2.1.2-2.37.aarch64.rpm"
RPM_HASH = "ead0e57ee1462dd3002e2ab5726bd2cbef68f72e48ee381d28064e385e7c0f2d3d29486c5bc8505338771618187359982d21c01e7c1a37c58573ab00f98f2b96"

RPROVIDES:${PN} += "libccrtp.so.3 \
libccrtp3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcommoncpp.so.8 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libstdc++.so.6 \
libucommon.so.8"

inherit rpm
