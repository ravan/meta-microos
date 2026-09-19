SUMMARY = "Development headers for Boost.Locale library"
DESCRIPTION = "This package contains development headers for Boost.Locale library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_locale1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "c7156f26e303413168032862aa939ea7cc5a73d9856e62b18b5d95f2ae680501730c3526a77badb8cb2811d6038821321495b65d0705500ad5c0a1e32d10a40a"

RPROVIDES:${PN} += "libboost-locale-devel-impl \
libboost-locale1-91-0-devel"

RDEPENDS:${PN} += "libboost-charconv1-91-0-devel \
libboost-chrono1-91-0-devel \
libboost-headers1-91-0-devel \
libboost-locale1-91-0 \
libboost-thread1-91-0-devel \
libicu-devel"

inherit rpm
