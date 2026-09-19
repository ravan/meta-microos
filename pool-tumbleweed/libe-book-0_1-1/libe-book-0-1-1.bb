SUMMARY = "A library to import non-HTML reflowable e-book formats"
DESCRIPTION = "libe-book is a library to import non-HTML reflowable e-book formats. \
Currently supported are PalmDoc, TealDoc, Plucker eBook, eReader eBook, \
FictionBook v.2, TCR, zTXT."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libe-book-0_1-1-0.1.3-4.14.aarch64.rpm"
RPM_HASH = "d2407d00ae3459d273d52941b1dafe2024ff934ff933f4fe84ccc730bdc19c31a910da09b47bb3b143c4054e17c8cc65754b53f6cdb9333bc1fc68e58a76d2bc"

RPROVIDES:${PN} += "libe-book-0-1-1 \
libe-book-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
liblangtag.so.1 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
