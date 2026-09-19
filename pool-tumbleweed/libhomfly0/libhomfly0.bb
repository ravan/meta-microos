SUMMARY = "Library to compute the homfly polynomial of a link"
DESCRIPTION = "A library to compute the homfly polynomial of a link."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "1.04"

RPM_NAME = "libhomfly0-1.04-1.3.aarch64.rpm"
RPM_HASH = "0c264af7e5b90235bbaffbc4baa472bdba0195a6189059c5dd5c0a3064a113354d052ce59948949645f41f5dcc0838d2a07b566a3733e31dea04f6a0d59322f3"

RPROVIDES:${PN} += "libhomfly.so.0 \
libhomfly0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgc.so.1"

inherit rpm
