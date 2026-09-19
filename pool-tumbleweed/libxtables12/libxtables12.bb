SUMMARY = "The iptables plugin interface"
DESCRIPTION = "This library contains all the iptables code shared between iptables, \
ip6tables, their extensions, and for external integration for e.g. \
iproute2's m_xt."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.13"

RPM_NAME = "libxtables12-1.8.13-1.4.aarch64.rpm"
RPM_HASH = "90d31bedb2c7fdcd9c3eab582d79d6bcb95c5d166e9f90e1939dcb717acad9cd15eb7c58a3b024808e503119b91192f35094e75c08e83605f69a5307bc0eccc2"

RPROVIDES:${PN} += "libxtables.so.12 \
libxtables12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
