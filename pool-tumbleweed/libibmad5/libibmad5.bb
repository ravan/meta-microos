SUMMARY = "Libibmad runtime library"
DESCRIPTION = "Libibmad provides low layer IB functions for use by the IB diagnostic \
and management programs. These include MAD, SA, SMP, and other basic IB \
functions. This package contains the runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "libibmad5-63.0-1.3.aarch64.rpm"
RPM_HASH = "b3635972740a6209fd1ac8bc366c0a589b8c06010705f991062575dfe3d644a8961bf160fc2c8bb6ca57a87f161c5b169cd643f761019b1a8a2cc73dc67e63e3"

RPROVIDES:${PN} += "libibmad.so.5 \
libibmad5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad.so.3"

inherit rpm
