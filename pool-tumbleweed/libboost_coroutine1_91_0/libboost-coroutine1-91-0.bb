SUMMARY = "Boost::Coroutine runtime library"
DESCRIPTION = "This package contains the Boost Coroutine runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_coroutine1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "1175290100151c8d31bb61b9cdfed70a4ee9f42d486edb6d315682adcd9d5c00bf1392e88fb2f3e7494a225717c44328e65c96cfba7f4484e788966ec1d9af6d"

RPROVIDES:${PN} += "libboost-coroutine.so.1.91.0 \
libboost-coroutine1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libboost-context.so.1.91.0 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
