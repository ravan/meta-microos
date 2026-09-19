SUMMARY = "C library for controlling the gpio-sim kernel module"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
GPIO sim library part. (This aims at replacing the old gpio-mockup)"
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.4"

RPM_NAME = "libgpiosim1-2.2.4-1.3.aarch64.rpm"
RPM_HASH = "8445eb50165be4feaf620e6d585ff209aaaeef43c1b1beb41eaa7fe46258111e172170d17b7a5ec92054301c6d6e6852de529d29a7aa50d22df070035f807f25"

RPROVIDES:${PN} += "libgpiosim.so.1 \
libgpiosim1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkmod.so.2 \
libmount.so.1"

inherit rpm
