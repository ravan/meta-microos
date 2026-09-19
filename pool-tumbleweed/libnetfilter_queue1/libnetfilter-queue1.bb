SUMMARY = "Userspace library for packets that have been queued by the kernel packet filter"
DESCRIPTION = "libnetfilter_queue is a userspace library providing an API to packets \
that have been queued by the kernel packet filter. It is is part of a \
system that deprecates the old ip_queue / libipq mechanism. \
 \
libnetfilter_queue has been previously known as libnfnetlink_queue."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "libnetfilter_queue1-1.0.5-2.19.aarch64.rpm"
RPM_HASH = "a8b72d7edf3d1e5b1173dec903900b3e66f2e20c2b08e3fea4afcd09ae427458995cdf55eea67c2539226b61ed13778a4ff62831e9d63b03ee8dcac157a18f41"

RPROVIDES:${PN} += "libnetfilter-queue.so.1 \
libnetfilter-queue1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libnfnetlink.so.0"

inherit rpm
