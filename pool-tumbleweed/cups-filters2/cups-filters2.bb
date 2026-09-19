SUMMARY = "OpenPrinting CUPS filters 2.x for CUPS 2.x"
DESCRIPTION = "This package contains backends, filters, and other software \
that was once part of CUPS, but during the time when CUPS \
was developed at Apple, Apple stopped maintaining these \
parts as they were not needed by Mac OS. \
In addition it contains more filters and software developed \
independently of Apple, especially filters for the PDF-centric \
printing workflow introduced by OpenPrinting. \
Since CUPS 1.6.0 cups-filters is required for using printer \
drivers (and also driverless printing) with CUPS under Linux. \
This version 2.x of cups-filters is only for CUPS 2.2.2 or newer \
(for older CUPS versions use cups-filters version 1.x)."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "cups-filters2-2.0.1-1.5.aarch64.rpm"
RPM_HASH = "192a5cb072896cb1de1a1d1a0e769c936525a79b2560845e4af8db21611faf3f8ad3844ba12d0f28fbb94cc628392ac1fe59d631eb4697de509e7cae618625da"

RPROVIDES:${PN} += "cups-filters \
cups-filters2 \
postscriptdriver-fuji-xerox;docuprint-cm305-df; \
postscriptdriver-generic;pdf-printer; \
postscriptdriver-hewlett-packard;hp-color-laserjet-cm3530-mfp; \
postscriptdriver-ricoh;pdf-printer;"

RDEPENDS:${PN} += "/usr/bin/sh \
cups \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libcupsfilters \
libcupsfilters.so.2 \
libppd \
libppd.so.2"

inherit rpm
