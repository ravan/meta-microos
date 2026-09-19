SUMMARY = "Userspace library for packets that have been queued by the kernel packet filter"
DESCRIPTION = "libnetfilter_queue is a userspace library providing an API to packets \
that have been queued by the kernel packet filter. It is is part of a \
system that deprecates the old ip_queue / libipq mechanism. \
 \
libnetfilter_queue has been previously known as libnfnetlink_queue."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "libnetfilter_queue-devel-1.0.5-2.19.aarch64.rpm"
RPM_HASH = "3dd827a49ffd3f4f802e30bae34e64926682395ec49b08cba6ec7f25349d42e7b67283df5fd1d9e992921418a5a5be6e6f587aae625d741b67c77c230ec82315"

RPROVIDES:${PN} += "libnetfilter-queue-devel \
pkgconfig-libnetfilter-queue"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetfilter-queue1 \
libnfnetlink-devel \
pkgconfig-libnfnetlink"

inherit rpm
