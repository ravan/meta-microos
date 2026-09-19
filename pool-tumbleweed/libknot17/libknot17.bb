SUMMARY = "Knot DNS support library"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains the essential core library for Knot services."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "libknot17-3.6.0-1.1.aarch64.rpm"
RPM_HASH = "919235081a9a30d5c93e05cf02673c41c772a79000a173e0265397f26d6ecb4e6daf5b8e134af0301b2cde018e217e8fdb58896e53830ce52c1858e59de21558"

RPROVIDES:${PN} += "libknot.so.17 \
libknot17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
liblmdb-0.9.35.so \
libm.so.6 \
libngtcp2-crypto-gnutls.so.8 \
libngtcp2.so.16"

inherit rpm
