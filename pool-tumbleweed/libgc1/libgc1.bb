SUMMARY = "A garbage collector for C and C++"
DESCRIPTION = "The Boehm-Demers-Weiser conservative garbage collector can be used as a \
garbage collecting replacement for C malloc or C++ new. It allows you \
to allocate memory basically as you normally would, without explicitly \
deallocating memory that is no longer useful. The collector \
automatically recycles memory when it determines that it can no longer \
be otherwise accessed."
LICENSE = "BSD-3-Clause"

PV = "8.2.12"

RPM_NAME = "libgc1-8.2.12-1.3.aarch64.rpm"
RPM_HASH = "278e3f8236c0a71f9802d2e7d8b80fa6587e6a30f82ed83bcb865fab3215aef968a3663807df69e5f38c9557afd802da87fbbf6c97be2bace1d2c315de04aecf"

RPROVIDES:${PN} += "libcord.so.1 \
libgc.so.1 \
libgc1 \
libgccpp.so.1 \
libgctba.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
