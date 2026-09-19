SUMMARY = "Userspace library to access the nftables Netlink interface"
DESCRIPTION = "libnftnl is a userspace library providing a low-level netlink \
programming interface (API) to the in-kernel nf_tables subsystem."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libnftnl11-1.3.2-1.1.aarch64.rpm"
RPM_HASH = "3931f6807c1064e6b678dd95e5b7d86a0e887b5f024230f0b39845caaa9d593cc1a4fffbed17a3fa4dfbad9ba63f510d21884b1961647bc4ffe013021cd381d2"

RPROVIDES:${PN} += "libnftnl.so.11 \
libnftnl11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
