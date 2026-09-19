SUMMARY = "OpenPrinting CUPS filters, backends, and cups-browsed"
DESCRIPTION = "Contains backends, filters, and other software \
that was once part of the core CUPS distribution \
but is no longer maintained by Apple Inc. \
In addition it contains additional filters \
and software developed independently of Apple, \
especially filters for the PDF-centric printing \
workflow introduced by OpenPrinting and a daemon \
to auto-discover printers in the local network \
and make these printers available locally \
in the separated cups-filters-cups-browsed RPM. \
Since Ghostscript version 9.10 the CUPS filters \
gstoraster and gstopxl are removed from Ghostscript. \
Those filters are now provided by cups-filters. \
Since cups-filters version 1.0.42 foomatic-rip \
is also provided by cups-filters."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT"

PV = "1.28.17"

RPM_NAME = "cups-filters-1.28.17-9.1.aarch64.rpm"
RPM_HASH = "c97194d7faf65b6a1c468c0c651d888dd6390759158eb0c8dd78b8e2a45e8b1b1d3f289c2e41497ae3b291cca9b00f6c1b375fb4b2269c7320c21ad0b0af5979"

RPROVIDES:${PN} += "cups-filters \
cups-filters-foomatic-rip \
cups-filters-ghostscript \
foomatic-filters \
foomatic-rip \
gstoraster \
libcupsfilters.so.1 \
libfontembed.so.1 \
postscriptdriver-fuji-xerox;docuprint-cm305-df; \
postscriptdriver-generic;pdf-printer; \
postscriptdriver-hewlett-packard;hp-color-laserjet-cm3530-mfp; \
postscriptdriver-ricoh;pdf-printer;"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libdbus-1.so.3 \
libexif.so.12 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libpoppler-cpp.so.3 \
libqpdf.so.30 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1 \
systemd"

inherit rpm
