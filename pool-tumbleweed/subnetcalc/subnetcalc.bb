SUMMARY = "IPv4/IPv6 Subnet Calculator"
DESCRIPTION = "SubNetCalc is an IPv4/IPv6 subnet address calculator. For a given IPv4 or IPv6 \
address and netmask or prefix length, it calculates network address, broadcast \
address, maximum number of hosts and host address range. It also prints the \
addresses in binary format for better understandability. Furthermore, it \
prints information on specific address types (e.g. type, scope, \
interface ID, etc.)."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.6"

RPM_NAME = "subnetcalc-2.6.6-1.3.aarch64.rpm"
RPM_HASH = "52fea7eefa8c01c92f29d1508a0beb76e764fa6f5f51d2c6b979d0a879b59895fc77a255c35a8c6e87bd6a55f29e1bc6b2b8e89a911dc5c109215571f0a63a3b"

RPROVIDES:${PN} += "subnetcalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
