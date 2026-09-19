SUMMARY = "Boost.CharConv runtime library"
DESCRIPTION = "This package contains Boost::CharConv runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_charconv1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "f3cd95021fdfd954138f50c885aed19d8e6e8db0d923bf84614897eeacc925de7cfe7913fc95741a29ba8b5f0baa20d34cf6f33161ccad5e2d7d23ac7d83df9c"

RPROVIDES:${PN} += "libboost-charconv.so.1.91.0 \
libboost-charconv1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
