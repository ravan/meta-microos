SUMMARY = "Shared code for the VLC media player program"
DESCRIPTION = "This subpackage contains libraries that are part of VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.23"

RPM_NAME = "libvlccore9-3.0.23-7.12.aarch64.rpm"
RPM_HASH = "77d2a4d1acc4da61a7f2670c19b36fb719897ae0d79056ea5c84cc1ee08c15477ebeacf1d220f01bb38bede616ff1f79165437fb00ef93c10a082b0a96b0a609"

RPROVIDES:${PN} += "libvlccore.so.9 \
libvlccore9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libidn.so.12 \
libm.so.6"

inherit rpm
