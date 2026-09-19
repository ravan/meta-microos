SUMMARY = "The Boost::Chrono runtime library"
DESCRIPTION = "This package contains the Boost::Chrono runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_chrono1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "55f8b247fd46dac02164b58989922043ad3c17042c69d304b038f1853273e4e684aeb6313bfbebb167c93a45e30f261152a594894100b6fe43aa135b56fbcb23"

RPROVIDES:${PN} += "libboost-chrono.so.1.91.0 \
libboost-chrono1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
