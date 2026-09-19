SUMMARY = "Development headers for Boost.DateTime library"
DESCRIPTION = "This package contains development header files and libraries for \
Boost.DateTime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_date_time1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "86594ec7b04bbbadcfc61ee07bf51854bbbde60d6d57301b8ad2d80380f6fb51e58b5cd0d65bcd041aa429a4eeec3211bd4c8ec743b965f609ada3e7c5a72c55"

RPROVIDES:${PN} += "libboost-date-time-devel-impl \
libboost-date-time1-91-0-devel"

RDEPENDS:${PN} += "libboost-date-time1-91-0 \
libboost-headers1-91-0-devel \
libstdc++-devel"

inherit rpm
