SUMMARY = "Shared library for zinnia"
DESCRIPTION = "This package contains shared libraries used by zinnia."
LICENSE = "BSD-3-Clause"

PV = "0.07"

RPM_NAME = "libzinnia0-0.07-2.19.aarch64.rpm"
RPM_HASH = "faa9415ec44e13b41274533cac66d45813fd2879946fd6d40bbaae90d905ccd801c0a368304b06815c7b4f26a1152a751e4b9baea27aaf2062e42eb3437f64a8"

RPROVIDES:${PN} += "libzinnia.so.0 \
libzinnia0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
