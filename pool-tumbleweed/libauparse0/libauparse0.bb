SUMMARY = "Library for parsing and interpreting audit events"
DESCRIPTION = "The libauparse package contains the shared libraries needed to \
parse audit records."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "libauparse0-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "ec57e6337d2084998d8b424866a75daa4077ee9eddae69ab82e1bbfd4c62e4a3244169590697c3a6f690f3378d5bf2f0a8d33776148165cdb03e11108c6e2ab7"

RPROVIDES:${PN} += "libauparse.so.0 \
libauparse0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6"

inherit rpm
