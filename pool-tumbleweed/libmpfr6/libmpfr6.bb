SUMMARY = "The GNU multiple-precision floating-point shared library"
DESCRIPTION = "The MPFR library is a C library for multiple-precision floating-point \
computations with exact rounding (also called correct rounding). It is \
based on the GMP multiple-precision library."
LICENSE = "LGPL-3.0-or-later"

PV = "4.2.2"

RPM_NAME = "libmpfr6-4.2.2-1.5.aarch64.rpm"
RPM_HASH = "37ba7e26af78c892dc0f2a8e988cea5f6add42057cafe66d8357e8b28d202f4e895c08aebc604cd4b1528a85a91c63c80ae5e201f2679c766d7198cb69b3fedc"

RPROVIDES:${PN} += "libmpfr.so.6 \
libmpfr6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
