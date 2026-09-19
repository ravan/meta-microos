SUMMARY = "Threaded poller for Cacti written in C"
DESCRIPTION = "Spine is a supplemental poller for Cacti that makes use of pthreads to achieve \
excellent performance."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.31"

RPM_NAME = "cacti-spine-1.2.31-1.3.aarch64.rpm"
RPM_HASH = "da5ba8dbfb0eb19f940ccc3b94e186d7416f4bc05e74d926a9e088f5955d82ed60ecf16a244a84fd5b6bbc880da806044dc7bd13e15bc8c76fbf7bc4bf5c40aa"

RPROVIDES:${PN} += "cacti-spine \
config-cacti-spine"

RDEPENDS:${PN} += "cacti \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmariadb.so.3 \
libnetsnmp.so.45 \
rrdtool"

inherit rpm
