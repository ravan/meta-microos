SUMMARY = "Boost.URL runtime library"
DESCRIPTION = "This package contains the Boost::URL runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_url1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "4593a366432c8521477b626f6743a2d426c9cc3d86c3167d7b4c5da52d0bfcf8d5e0c2e18813fc32fb1c20c27e0cfd32076385b2946694a0f00e827c5fa91a2c"

RPROVIDES:${PN} += "libboost-url.so.1.91.0 \
libboost-url1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
