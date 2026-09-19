SUMMARY = "Standard library for baresip"
DESCRIPTION = "This package contains the shared library needed to run programs compiled with \
baresip"
LICENSE = "BSD-3-Clause"

PV = "4.11.0"

RPM_NAME = "libbaresip28-4.11.0-1.1.aarch64.rpm"
RPM_HASH = "94ce50bc1df076782eb15caf6e6cd4950ead39c96e5f72e69facddb0abb2b08c7337ab0e9a6a54a99e94ee25fad566781c7929e8796ef8c081ebce7572c065aa"

RPROVIDES:${PN} += "baresip \
libbaresip.so.28 \
libbaresip28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libre.so.45"

inherit rpm
