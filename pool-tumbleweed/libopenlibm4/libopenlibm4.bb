SUMMARY = "Standalone C mathematical library"
DESCRIPTION = "OpenLibm is an implementation of a standalone C mathematical library \
(libm). It can be used standalone in applications and programming \
language implementations. \
 \
The OpenLIBM code derives from the FreeBSD msun implementation, \
which in turn derives from FDLIBM 5.3. As a result, it has a number of \
fixes and updates that have accumulated over the years in msun, \
and also optimized assembly versions of many functions."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8.1"

RPM_NAME = "libopenlibm4-0.8.1-2.11.aarch64.rpm"
RPM_HASH = "1921d391dd792a4e10d8f5caae896604a6ba4fad98d5d0b9bb9c228eaf29e17c65568248aa1bb1d7b28d4185e1e448b307df34a5f449cc9429216d4c611534d5"

RPROVIDES:${PN} += "libopenlibm.so.4 \
libopenlibm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
