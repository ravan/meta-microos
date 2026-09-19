SUMMARY = "Support tools for Reliable Datagram Sockets"
DESCRIPTION = "A collection of support tools for the RDS socket API."
LICENSE = "BSD-3-Clause | GPL-2.0"

PV = "2.3.11"

RPM_NAME = "rds-tools-2.3.11-1.5.aarch64.rpm"
RPM_HASH = "d66d699b1173d2a260e861d098e5c8b4a917429737ed1420000db36c2deb6e6802a78ac0ca35a4448b5582dce72bb2e57d958d39180767c3b8a5844b1c8792ef"

RPROVIDES:${PN} += "rds-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libjson-c.so.5"

inherit rpm
