SUMMARY = "DBus for libgpiod"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
DBus part."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.4"

RPM_NAME = "libgpiodbus1-2.2.4-1.3.aarch64.rpm"
RPM_HASH = "43fa098fb36df1130b100b0a858e4ffbdbcd11293d4a1536176367a9d762ca5291b6a25426a231ba4cc5cdad04adc5ea201a45363abd912cd2d192477e73f702"

RPROVIDES:${PN} += "libgpiodbus.so.1 \
libgpiodbus1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
