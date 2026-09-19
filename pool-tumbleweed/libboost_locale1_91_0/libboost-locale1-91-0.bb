SUMMARY = "Boost::Locale runtime library"
DESCRIPTION = "This package contains Boost::Locale runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_locale1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "f663dd0f26fa4ba5cb45c195ca6acdd342afa7ee1d0f0e3f5b4a8791e5a93e7f6abc6445647ceabd9686a3bd69984989f14e4c00b2f274ffc7bc99cb9f84e65f"

RPROVIDES:${PN} += "libboost-locale.so.1.91.0 \
libboost-locale1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
