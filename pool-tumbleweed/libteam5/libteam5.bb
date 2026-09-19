SUMMARY = "Library for controlling 802.1AX team network device"
DESCRIPTION = "A library which is the user-space counterpart for the team network \
driver, and provides an API to control them. \
 \
Linux kernel 3.3 and above offer a so-called 'team' network driver - \
a lightweight mechanism for bonding multiple interfaces together. \
It is a userspace-driven alternative to the existing bonding driver."
LICENSE = "LGPL-2.1-or-later"

PV = "1.32"

RPM_NAME = "libteam5-1.32-2.10.aarch64.rpm"
RPM_HASH = "089c9a5424626be462fdd8b5bc0eef0710c91b442c988db2dd588efffac13a4e49852cbb50b54bd5adf5895a649b0967f1536ed14297bc41713128b383738b8e"

RPROVIDES:${PN} += "libteam.so.5 \
libteam5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-cli-3.so.200 \
libnl-genl-3.so.200 \
libnl-route-3.so.200"

inherit rpm
