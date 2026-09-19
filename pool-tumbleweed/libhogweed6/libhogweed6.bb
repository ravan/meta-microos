SUMMARY = "Cryptographic Library for Public Key Algorithms"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space. \
 \
The libhogweed library contains public key algorithms to use with libnettle."
LICENSE = "LGPL-2.1-or-later"

PV = "3.10.2"

RPM_NAME = "libhogweed6-3.10.2-1.6.aarch64.rpm"
RPM_HASH = "14f6ce541e4487c3ca099b9d538f6941d29099f53dbc2aae378883170002c979a761048e9474cd142127437016094294da035083565c9c6fa1f9805192c1e5c5"

RPROVIDES:${PN} += "libhogweed.so.6 \
libhogweed6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libnettle.so.8"

inherit rpm
