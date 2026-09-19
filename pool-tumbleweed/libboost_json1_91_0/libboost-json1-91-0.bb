SUMMARY = "Boost.JSON runtime library"
DESCRIPTION = "This package contains Boost::JSON runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_json1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "fb1e5e4285f395544810123e5b0ff4451c722102593fe764bf469ae964e9596361b34f6b1015e5e997b498422000f5f12d3720d312fea8a2fb8c3d0682eadf92"

RPROVIDES:${PN} += "libboost-json.so.1.91.0 \
libboost-json1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
