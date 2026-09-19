SUMMARY = "A program for looking up data of elements from the periodic table"
DESCRIPTION = "GPeriodic is a program for looking up data of elements from the \
periodic table. This program also features a non-graphical interface."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.3"

RPM_NAME = "gperiodic-3.0.3-3.8.aarch64.rpm"
RPM_HASH = "7b344c6fb6fab0ae6acc387226eafa23e8cf0d9ebae28439772901093d3e23cf5839be6cd719eb005fe5cf42b65ee5b160ed28a9c7e047feecd31bd7466436d9"

RPROVIDES:${PN} += "gperiodic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
