SUMMARY = "Library for controlling the team network device daemon"
DESCRIPTION = "Linux kernel 3.3 and above offer a so-called 'team' network driver - \
a lightweight mechanism for bonding multiple interfaces together. \
It is a userspace-driven alternative to the existing bonding driver."
LICENSE = "LGPL-2.1-or-later"

PV = "1.32"

RPM_NAME = "libteamdctl0-1.32-2.10.aarch64.rpm"
RPM_HASH = "784dc637a1f65456b728edec43add3d91944d6d7193fd23f483365aedaca794d1f30114031233f4457f7a53a29213a68fe5ccb2d75c2796730c8572f1194af4b"

RPROVIDES:${PN} += "libteamdctl.so.0 \
libteamdctl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
