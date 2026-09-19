SUMMARY = "Library to crack passwords using dictionaries"
DESCRIPTION = "CrackLib tests passwords to determine whether they match \
certain security-oriented characteristics. You can use CrackLib to \
stopusers from choosing passwords that are too simple.This package \
contains a full dictionary file used by cracklib."
LICENSE = "LGPL-2.1-only"

PV = "2.9.11"

RPM_NAME = "libcrack2-2.9.11-1.11.aarch64.rpm"
RPM_HASH = "21030f241255707dee49b99c7da65f9a9ee633cec038e4411f8cc16fb89186503bef4dc47d80d55db9f3ec9c8ed0b4664d2b8bf968ad54e7cc749d70cc2dbbc5"

RPROVIDES:${PN} += "libcrack.so.2 \
libcrack2"

RDEPENDS:${PN} += "/sbin/ldconfig \
cracklib \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
