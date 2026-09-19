SUMMARY = "Documentation tool geared towards C++"
DESCRIPTION = "QuickBook is a WikiWiki style documentation tool geared towards C++ \
documentation using simple rules and markup for simple formatting \
tasks."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "boost1_91_0-quickbook-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "f7c466a6452c2c999fa9a2d74fe419e372a259d2908c053e011cb5fd3694fd87c44741b8b00e2568670f00b0db5bc169dd50e03ba989b99a1d25fbb3058ccf6a"

RPROVIDES:${PN} += "boost1-91-0-quickbook \
quickbook"

RDEPENDS:${PN} += "boost-license1-91-0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
