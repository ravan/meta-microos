SUMMARY = "Userspace library for the Netfilter Conntrack Timeout extension"
DESCRIPTION = "This library provides the programming interface (API) to the \
Netfilter extended timeout settings infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "libnetfilter_cttimeout1-1.0.1-1.15.aarch64.rpm"
RPM_HASH = "79ee2562d435d04b47c58f7c820edc21ffe7d489fec4eb33f4aedaf1a514824991c1c92f463ab8166a95b6e7c7c260048ea78e0127aeef6a9be18dc21c2ecf39"

RPROVIDES:${PN} += "libnetfilter-cttimeout.so.1 \
libnetfilter-cttimeout1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
