SUMMARY = "Libraries for applications using PowerMan"
DESCRIPTION = "A shared library for applications using PowerMan."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.4"

RPM_NAME = "libpowerman0-2.4.4-3.3.aarch64.rpm"
RPM_HASH = "c2a6ff66210df7d23253c264c55214140af4113a41b8efd029b6bc6cd435fb0f141d24180d9410883cfd3dd9dc64d2fc6bad80cc76f695584797a3c812d316d7"

RPROVIDES:${PN} += "libpowerman.so.0 \
libpowerman0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
