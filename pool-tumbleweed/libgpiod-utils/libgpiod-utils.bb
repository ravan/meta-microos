SUMMARY = "Tools for interacting with the linux GPIO character device"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
Command-line tools part."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.4"

RPM_NAME = "libgpiod-utils-2.2.4-1.3.aarch64.rpm"
RPM_HASH = "c1ac7620045e0f30436a9cde85f4f834e2031e739f0fe4ef6406cc1a8a07a60b19af4549174b5e796811726e5d91e341b9298cdebc4ddd964669df7843ad1f67"

RPROVIDES:${PN} += "libgpiod-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgpiod.so.3"

inherit rpm
