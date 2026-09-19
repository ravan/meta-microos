SUMMARY = "Zone record parsing functions for Knot DNS"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains a library for a zone record scanner."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "libzscanner5-3.6.0-1.1.aarch64.rpm"
RPM_HASH = "357fedd94f3cd7e7a8a268f8a238aecc9a1d44992e1cd8333de4b23a13cfa83ab319d8c093fd028818365cf73a5c3e25102b8a688ca93b1936e4e177d4c1c3a8"

RPROVIDES:${PN} += "libzscanner.so.5 \
libzscanner5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
