SUMMARY = "Development headers for Boost.Log library"
DESCRIPTION = "Development headers for Boost.Log library which aims to make logging \
significantly easier for the application developer. It provides a wide \
range of out-of-the-box tools along with public interfaces for extending \
the library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_log1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "fd683be157404505b852ff21eff5becfb30d5e5b56e610f3a7d3959f662f8c0277dddf2d13530e8472adc44d4bdd17f1ffe69e5724eedca15a609dbdaab1e9f1"

RPROVIDES:${PN} += "libboost-log-devel-impl \
libboost-log1-91-0-devel"

RDEPENDS:${PN} += "libboost-atomic1-91-0-devel \
libboost-chrono1-91-0-devel \
libboost-date-time1-91-0-devel \
libboost-filesystem1-91-0-devel \
libboost-headers1-91-0-devel \
libboost-log1-91-0 \
libboost-random1-91-0-devel \
libboost-regex1-91-0-devel \
libboost-serialization1-91-0-devel \
libboost-thread1-91-0"

inherit rpm
