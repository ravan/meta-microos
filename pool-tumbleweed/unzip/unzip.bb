SUMMARY = "A program to unpack compressed files"
DESCRIPTION = "UnZip is an extraction utility for archives compressed in .zip format \
(known as 'zip files').  Although highly compatible both with PKWARE's \
PKZIP(tm) and PKUNZIP utilities for MS-DOS and with Info-ZIP's own Zip \
program, our primary objectives have been portability and non-MS-DOS \
functionality. This version can also extract encrypted archives."
LICENSE = "BSD-3-Clause"

PV = "6.00"

RPM_NAME = "unzip-6.00-45.3.aarch64.rpm"
RPM_HASH = "fd1d0c5fc08617a68068bef8f4e66ba9c5473ad64c07ec9d5365f1d634a2fc446821fc2c0f284bbaa9397ec0551ce412819a9157e9a656f73f9fd08e6a5fe0c6"

RPROVIDES:${PN} += "unzip"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
