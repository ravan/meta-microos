SUMMARY = "Virtual PDF printer for CUPS"
DESCRIPTION = "CUPS-PDF is a PDF writer backend for CUPS. \
It provides a virtual CUPS-PDF printer which produces PDF files \
so that application programs which have no built-in support \
to 'Save as PDF' could print to CUPS-PDF to get a PDF file. \
For details see /usr/share/doc/packages/cups-pdf/README \
and http://en.opensuse.org/SDB:Printing_to_PDF"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.2"

RPM_NAME = "cups-pdf-3.0.2-1.5.aarch64.rpm"
RPM_HASH = "d1cf71c3f132d294c39934f9ea6f02d33bcd60adf3e4adb1f7e840644bfa45f7ab4b836e474b4ed187ca5e56692152d4912f8c5ddcede8fa480df96023643513"

RPROVIDES:${PN} += "config-cups-pdf \
cups-pdf \
postscriptdriver-generic;cups-pdf-printer;"

RDEPENDS:${PN} += "/usr/bin/sh \
cups-client \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2"

inherit rpm
