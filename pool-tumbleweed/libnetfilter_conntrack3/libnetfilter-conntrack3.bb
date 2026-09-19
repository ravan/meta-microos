SUMMARY = "Userspace library for the in-kernel connection tracking state table"
DESCRIPTION = "libnetfilter_conntrack is a userspace library providing a programming \
interface (API) to the in-kernel connection tracking state table. The \
library libnetfilter_conntrack has been previously known as \
libnfnetlink_conntrack and libctnetlink. This library is currently \
used by conntrack-tools among many other applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1"

RPM_NAME = "libnetfilter_conntrack3-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "7fc0382a47e3d4a3d12a1b72f53c27ba18e5df85776c5429e523cd49dba1d6c85e58f9b01801575e8cb3099cfa92fd7e7fecc667347cac2c5300714c5702f42f"

RPROVIDES:${PN} += "libnetfilter-conntrack.so.3 \
libnetfilter-conntrack3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libnfnetlink.so.0"

inherit rpm
