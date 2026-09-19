SUMMARY = "Boost.Regex runtime library"
DESCRIPTION = "This package contains the Boost.Regex runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_regex1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "ede0fd8353f1901e172501a899095ca2eb33b85e749362a405212f23251671864fd468e137479b186921d52d67ffb40804fb44add34b59032fac4237ebecf104"

RPROVIDES:${PN} += "libboost-regex.so.1.91.0 \
libboost-regex1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
