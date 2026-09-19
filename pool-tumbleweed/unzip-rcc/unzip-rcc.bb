SUMMARY = "A program to unpack compressed files"
DESCRIPTION = "UnZip is an extraction utility for archives compressed in .zip format \
(known as 'zip files').  Although highly compatible both with PKWARE's \
PKZIP(tm) and PKUNZIP utilities for MS-DOS and with Info-ZIP's own Zip \
program, our primary objectives have been portability and non-MS-DOS \
functionality. This version can also extract encrypted archives."
LICENSE = "BSD-3-Clause"

PV = "6.00"

RPM_NAME = "unzip-rcc-6.00-45.3.aarch64.rpm"
RPM_HASH = "f6c1d81f9f9d1d8109ac3b318cfb98780ae934bc9292140e12f14897a857007585e276b060f0cae3a6371228e3242cb38082f2b1e58a881da65b2c7e4f0e3259"

RPROVIDES:${PN} += "unzip \
unzip-rcc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
