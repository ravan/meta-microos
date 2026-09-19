SUMMARY = "C Library for Accessing CD-ROM Books - shared library"
DESCRIPTION = "EB Library is a C library for accessing CD-ROM books.  It can be built \
on UNIX-based systems.	EB Library supports accessing CD-ROM books in \
EB, EBG, EBXA, EBXA-C, S-EBXA, and EPWING formats.  CD-ROM books in \
those formats are popular in Japan.  Because CD-ROM books themselves \
are based on the ISO 9660 format, you can mount the CDs in the same way \
as other ISO 9660 CDs."
LICENSE = "GPL-2.0-or-later"

PV = "4.4.3"

RPM_NAME = "libeb16-4.4.3-7.5.aarch64.rpm"
RPM_HASH = "9b437c793db5aa1208d2a77893ffbc8cd8ede8d2a03f13f09e1392301b338042b678e75c0bba8d2b09d0778dd900d54b386f5c42a404f2a877376f59f0f6b0e1"

RPROVIDES:${PN} += "libeb.so.16 \
libeb16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
