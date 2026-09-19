SUMMARY = "Boost.Graph runtime library"
DESCRIPTION = "This package contains the Boost.Graph runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_graph1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "50061fa752323c1399757b4ffbb5d958496bbd8c3ae6bf3e6f9fa3e3bbe64114319d7b53f7bf500e4bfa987be5a63b5c29daa4b72ccdb5cdf0814b977be40e54"

RPROVIDES:${PN} += "libboost-graph.so.1.91.0 \
libboost-graph1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
