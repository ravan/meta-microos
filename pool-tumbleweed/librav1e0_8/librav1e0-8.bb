SUMMARY = "AV1 encoder library"
DESCRIPTION = "rav1e is an AV1 video encoder libary. It is designed to eventually cover all \
use cases, though in its current form it is most suitable for cases where \
libaom (the reference encoder) is too slow."
LICENSE = "BSD-2-Clause & ISC"

PV = "0.8.1"

RPM_NAME = "librav1e0_8-0.8.1-2.4.aarch64.rpm"
RPM_HASH = "198fed08dac849dcac31f89b48a81ffcef4419898c7a58636fca89bb43b23901a29d701746cc341dab6c68714ca697d6daafb9b52e15a4d0e2d2216fd032ddbc"

RPROVIDES:${PN} += "librav1e.so.0.8 \
librav1e0-8"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
