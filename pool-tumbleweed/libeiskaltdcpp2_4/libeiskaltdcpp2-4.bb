SUMMARY = "Shared library for eiskaltdcpp"
DESCRIPTION = "This package contains Shared library for EiskaltDC++."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "libeiskaltdcpp2_4-2.4.2-6.2.aarch64.rpm"
RPM_HASH = "7a5b965091f3f676f280151736aaa7836f856617a3e1b5593280545d70ab3dff8bc4362c7fcab197391d000ea1c1c2cfb12ad6ffd765c67ae0714a6b4ed5e1e1"

RPROVIDES:${PN} += "libeiskaltdcpp.so.2.4 \
libeiskaltdcpp2-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libidn.so.12 \
libminiupnpc.so.21 \
libpcre2-8.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
