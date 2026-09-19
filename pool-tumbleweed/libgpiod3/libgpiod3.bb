SUMMARY = "C library for interacting with the linux GPIO character device"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
C library part."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.4"

RPM_NAME = "libgpiod3-2.2.4-1.3.aarch64.rpm"
RPM_HASH = "fbef9a874f1a36f00c05943848940fdda1990607883f9bab82fd394037f07b9261a699a1b3008108395a59d7bf90994b5074967f470086b2456fd89c8c801704"

RPROVIDES:${PN} += "libgpiod.so.3 \
libgpiod3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
