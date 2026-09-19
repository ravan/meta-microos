SUMMARY = "A Firewire Interface library"
DESCRIPTION = "libraw1394 provides direct access to the connected 1394 buses to \
userspace. Through this library, applications can directly send to \
and receive from other nodes without requiring a kernel driver for \
the protocol in question. \
 \
libraw1394 abstracts the interface that is used to communicate with \
the kernel. It works with both the Juju stack (firewire-core.ko; \
/dev/fw*; present since Linux kernel 2.6.22) and the old Linux1394 \
(raw1394.ko; /dev/raw1394; present until 2.6.36)."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.2"

RPM_NAME = "libraw1394-11-2.1.2-2.9.aarch64.rpm"
RPM_HASH = "c3e469a0bfd38ff4eeda79680d20ac3c150ce4ed2626e5f547717ece3e3fc2b3be2bbf59f888c0d2d694616ad1c3c42d9e13513d07e36a1d292dcc1fe90e805b"

RPROVIDES:${PN} += "libraw1394-11 \
libraw1394.so.11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
