SUMMARY = "The next generation profiling tool for Linux"
DESCRIPTION = "The next generation profiling tool for Linux"
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "gprofng-2.45-4.3.aarch64.rpm"
RPM_HASH = "8515cbf24341cc49722500b395ead59effbdebab8907e1c2ebfd06d2cf8404e03e32d4dd0181bebb28ff0e621dcde285f2017a81210d706e4d62c5856d44f7cf"

RPROVIDES:${PN} += "gprofng \
libgp-collector.so \
libgp-collectorAPI.so \
libgp-heap.so \
libgp-iotrace.so \
libgp-sync.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
