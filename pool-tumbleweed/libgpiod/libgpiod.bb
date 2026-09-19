SUMMARY = "C library and tools for interacting with the linux GPIO character device"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.4"

RPM_NAME = "libgpiod-2.2.4-1.3.aarch64.rpm"
RPM_HASH = "dbd9bb5ffca354c1b2f78b3cf0da79a52c2eec0d6861375e837504a3e9d3c3bf4fb3e0145b00a72209a4db95f65fdf10f9520fbc129fabea835ed2327e276ee3"

RPROVIDES:${PN} += "libgpiod"

RDEPENDS:${PN} += ""

inherit rpm
