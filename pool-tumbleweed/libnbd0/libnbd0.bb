SUMMARY = "Core library for nbd"
DESCRIPTION = "This is the NBD client library in userspace, a simple library for \
writing NBD clients."
LICENSE = "LGPL-2.1-or-later"

PV = "1.25.7"

RPM_NAME = "libnbd0-1.25.7-1.1.aarch64.rpm"
RPM_HASH = "b8d8530bdc03eb8a581485bf5921458bf2c7db8db57d585216904ba13d1b68f43e218e58ec273241f7b5f293866eb126c3351294d2db2b7af8f2054e3e97b10c"

RPROVIDES:${PN} += "libnbd.so.0 \
libnbd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libxml2.so.16"

inherit rpm
