SUMMARY = "A library for sharing Bible navigation"
DESCRIPTION = "BibleSync is a multicast protocol to support Bible software shared \
co- navigation. It uses LAN multicast in either a personal/small team \
mutual navigation motif or in a classroom environment where there are \
Speakers plus the Audience. It provides a complete yet minimal public \
interface to support mode setting, setup for packet reception, \
transmit on local navigation, and handling of incoming packets. \
 \
This library is not specific to any particular Bible software \
framework, completely agnostic as to structure of layers above \
BibleSync."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libbiblesync2_0-2.1.0-2.5.aarch64.rpm"
RPM_HASH = "922e347760ffd0b6a68801212e0db4bec583c362ba6c0a304e0fd3a4e02694c689033cca267312f899b6a812e8d7b8fbade5f10b31ec71180e2b10e3137bd287"

RPROVIDES:${PN} += "libbiblesync.so.2.0 \
libbiblesync2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
