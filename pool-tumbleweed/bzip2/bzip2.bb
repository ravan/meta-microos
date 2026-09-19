SUMMARY = "A Program for Compressing Files"
DESCRIPTION = "The bzip2 program is a program for compressing files."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "bzip2-1.0.8-6.1.aarch64.rpm"
RPM_HASH = "93d17068580b67732078c69f055470321bcada3320215baaa61735f7b1d1294971476719cec8b92910d63c0d79c335a96b7dd1bcc73911a9b53edd9f3092762a"

RPROVIDES:${PN} += "bzip \
bzip2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2-1 \
libbz2.so.1 \
libc.so.6"

inherit rpm
