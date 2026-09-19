SUMMARY = "Library for C split string functions"
DESCRIPTION = "Library for C split string functions. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcsplit1-20260703-1.2.aarch64.rpm"
RPM_HASH = "652faaa587dfafc2296abae6220e45d50794124fcf6231025b8397776ed81b7ebbe8a8f3c9f811bb541b0a42cbde52e503a63dedf4a23d8c89dea0288731f366"

RPROVIDES:${PN} += "libcsplit.so.1 \
libcsplit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
