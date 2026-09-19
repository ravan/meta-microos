SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "gcc13-devel-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "b9be40ed07ea4be5aad9b8931028d227c855df7f7db80eedaafb7fa362cfcb4c27c2a554bde2b65958fbc1a1ff85dd2df2ad74766b0b6245677fd56eb9042fcf"

RPROVIDES:${PN} += "gcc13-devel"

RDEPENDS:${PN} += "gcc13 \
gmp-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
mpc-devel"

inherit rpm
