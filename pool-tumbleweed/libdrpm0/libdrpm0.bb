SUMMARY = "A small library for fetching information from DeltaRPM packages"
DESCRIPTION = "This package provides a small library allowing one to fetch \
information from DeltaRPM packages."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libdrpm0-0.5.2-1.12.aarch64.rpm"
RPM_HASH = "62e51d492de1bdee7707c8d3b34cd30123075e08dd117ef9aeb3b9940b20f90b4daf2148b7e671c2326345e1003a5331f232b579cc0ed3389bdaef70354eb212"

RPROVIDES:${PN} += "libdrpm.so.0 \
libdrpm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzma.so.5 \
librpm.so.10 \
librpmio.so.10 \
libz.so.1 \
libzstd.so.1"

inherit rpm
