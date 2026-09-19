SUMMARY = "C++ wrapper library around the POSIX threads API"
DESCRIPTION = "C++ wrapper library around the POSIX threads API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.2"

RPM_NAME = "libclthreads2-2.4.2-3.9.aarch64.rpm"
RPM_HASH = "061cf504c2a1a7309fb1a17a8e5a9ae2ee23a6a2f0953447e1415a641d20075bc1bd7d05012bfcaadc0786de5cf42388732305e40039ff5bea81799f1f063af8"

RPROVIDES:${PN} += "libclthreads.so.2 \
libclthreads2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
