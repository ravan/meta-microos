SUMMARY = "Jitter entropy generator shared library"
DESCRIPTION = "The Jitter RNG provides a noise source using the CPU execution \
timing jitter. It depends on a high-resolution time stamp. \
 \
This package contains the shared library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "3.6.3"

RPM_NAME = "libjitterentropy3-3.6.3-1.6.aarch64.rpm"
RPM_HASH = "aa0c7d3b45d05ee5e6aa1396518825be0d7aaa59cdf8a9bdf5f5a335d5976ddb14e741abe8efa8508d638b305d18f9f6822330a6dab78b3a3ad6419e3cc3c491"

RPROVIDES:${PN} += "libjitterentropy.so.3 \
libjitterentropy3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
