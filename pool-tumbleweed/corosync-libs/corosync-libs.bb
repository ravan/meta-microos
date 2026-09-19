SUMMARY = "The corosync Cluster Engine Libraries"
DESCRIPTION = "This package contains corosync libraries."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "corosync-libs-3.1.10-5.1.aarch64.rpm"
RPM_HASH = "099b3a57c5cfe72ae4456b841e585930440e3c7963b79c7d6f1807cac32b3d147a6cfa0bca448bf1015f9989e20d2391b2eaad2e7dc3aa6a6f276224dd30a695"

RPROVIDES:${PN} += "corosync-libs \
libcfg.so.7 \
libcmap.so.4 \
libcorosync-common.so.4 \
libcpg.so.4 \
libquorum.so.5 \
libsam.so.4 \
libvotequorum.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libqb.so.100"

inherit rpm
