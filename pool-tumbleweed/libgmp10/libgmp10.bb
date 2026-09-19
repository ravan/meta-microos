SUMMARY = "A library for calculating huge numbers"
DESCRIPTION = "GMP is a library for arbitrary precision arithmetic, operating on \
signed integers, rational numbers, and floating-point numbers."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "6.3.0"

RPM_NAME = "libgmp10-6.3.0-5.6.aarch64.rpm"
RPM_HASH = "e41f09b759dabceab186349afa60f609f612a838812a117e8e26d5a82aa10cf955422675f295f29bdfad92712e73e9083b57b4308d3b781402a098fc9ed868a5"

RPROVIDES:${PN} += "libgmp.so.10 \
libgmp10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
