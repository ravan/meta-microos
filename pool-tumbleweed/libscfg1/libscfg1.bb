SUMMARY = "A C library for a simple configuration file format"
DESCRIPTION = "This is a C library for a simple configuration file format (scfg)."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "libscfg1-0.1.1-1.9.aarch64.rpm"
RPM_HASH = "c50d6b9a9e85e2f305f05f522b9b4290d4c973eb88bbefaf29d989b84590052c9e2d0648ceaf868f95690fffa932547affe85ed3bee699b5154048ebb1053c59"

RPROVIDES:${PN} += "libscfg.so.1 \
libscfg1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
