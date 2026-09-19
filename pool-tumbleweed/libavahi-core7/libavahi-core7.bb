SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-core7-0.8-45.2.aarch64.rpm"
RPM_HASH = "31d0d243e08e1f7203656e35c15eddba0c79eb29b7a186a4d8d28028cbc56f290715bdd34b2d2b4e979dba214b99881fd53261b799542657e31616415ba4640a"

RPROVIDES:${PN} += "libavahi-core.so.7 \
libavahi-core7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-common.so.3 \
libc.so.6"

inherit rpm
