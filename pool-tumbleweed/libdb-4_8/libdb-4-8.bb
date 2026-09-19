SUMMARY = "Berkeley DB Database Library Version 4.8"
DESCRIPTION = "The Berkeley DB Database is a programmatic toolkit that provides \
database support for applications. \
 \
This package contains the necessary runtime libraries."
LICENSE = "BSD-3-Clause & Sleepycat"

PV = "4.8.30"

RPM_NAME = "libdb-4_8-4.8.30-48.3.aarch64.rpm"
RPM_HASH = "740ed2e4c5101a568ba0225d5ebbdb09a5e56a18aa1d11d0a197890633420a85b7ff44c59168e22c3b3e2642b6c92c39165fe5c7a6218adb778b1133e1973479"

RPROVIDES:${PN} += "db \
libdb-4-8 \
libdb-4.8.so \
libdb-cxx-4.8.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
