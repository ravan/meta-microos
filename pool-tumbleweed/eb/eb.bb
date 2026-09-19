SUMMARY = "C Library for Accessing CD-ROM Books"
DESCRIPTION = "EB Library is a C library for accessing CD-ROM books.  It can be built \
on UNIX-based systems.	EB Library supports accessing CD-ROM books in \
EB, EBG, EBXA, EBXA-C, S-EBXA, and EPWING formats.  CD-ROM books in \
those formats are popular in Japan.  Because CD-ROM books themselves \
are based on the ISO 9660 format, you can mount the CDs in the same way \
as other ISO 9660 CDs."
LICENSE = "GPL-2.0-or-later"

PV = "4.4.3"

RPM_NAME = "eb-4.4.3-7.5.aarch64.rpm"
RPM_HASH = "d813063e0c39a77a596d25862acb83a64c4c797e26eb1bb3fbb0665dc9ca4f4b0527d2b2ad985275ab74ad0f26221835064a3bb618418655d5f1d064672deafd"

RPROVIDES:${PN} += "config-eb \
eb"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeb.so.16 \
libz.so.1"

inherit rpm
