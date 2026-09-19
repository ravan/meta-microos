SUMMARY = "Daemon to balance IRQs on SMP machines"
DESCRIPTION = "irqbalance dynamically switches the CPUs for IRQs to prevent cpu0 from \
being used for all IRQs."
LICENSE = "GPL-2.0-only"

PV = "1.9.5.3.git+48ab93a"

RPM_NAME = "irqbalance-1.9.5.3.git+48ab93a-1.5.aarch64.rpm"
RPM_HASH = "5aa340961c329eef4a38b8ca04986495b7ff704991344482bb009c4420d9ad9c93e9dba415fde7d7b300ac83ca1ed03f44427e25cfcd448898849e9c9b9a900d"

RPROVIDES:${PN} += "irqbalance"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libglib-2.0.so.0 \
libnuma.so.1 \
libsystemd.so.0"

inherit rpm
