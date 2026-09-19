SUMMARY = "Userspace library for the in-kernel Netfilter counters"
DESCRIPTION = "This library provides the programming interface (API) to the \
Netfilter extended accounting infrastructure."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libnetfilter_acct1-1.0.3-2.20.aarch64.rpm"
RPM_HASH = "4c69e55a7072e9a578597d625e125c5443712a459d38076d894743c282113450ef85e7307bdfb522564af8d7a07d81add2f79b257d99131d2d15b780552af101"

RPROVIDES:${PN} += "libnetfilter-acct.so.1 \
libnetfilter-acct1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
