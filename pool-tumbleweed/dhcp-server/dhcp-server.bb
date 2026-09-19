SUMMARY = "ISC DHCP Server"
DESCRIPTION = "This package contains the ISC DHCP server."
LICENSE = "MPL-2.0"

PV = "4.4.3.P1"

RPM_NAME = "dhcp-server-4.4.3.P1-1.2.aarch64.rpm"
RPM_HASH = "7bc37b351e0601c1b3fdabdb3140202506903cbb630a82aa27d53d743e0dad64f4d71f9731547a2a57a12a9ab8c7db326b5d912788afa5953bc63b6a722764e6"

RPROVIDES:${PN} += "config-dhcp-server \
dhcp-server \
group-dhcpd \
user-dhcpd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dhcp \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
sysuser-shadow"

inherit rpm
