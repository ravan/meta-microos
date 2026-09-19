SUMMARY = "Header files and development libraries for civetweb"
DESCRIPTION = "This package contains the header files and development libraries \
for civetweb. If you like to develop programs embedding civetweb on them, \
you will need to install civetweb-devel and check civetweb's API at its \
comprisable header file."
LICENSE = "MIT"

PV = "1.16+git1776611085.588860e3"

RPM_NAME = "civetweb-devel-1.16+git1776611085.588860e3-1.1.aarch64.rpm"
RPM_HASH = "aa1a0547b6fba97400cf0625b8e975ffe2dc83942e21f01151d93fb85be521fd9c77236e299940e711d7a14e766b3a4f3a6ba0834eedbe9aa7d90b8b7c3121da"

RPROVIDES:${PN} += "civetweb-devel \
cmake-civetweb \
pkgconfig-civetweb \
pkgconfig-civetweb-cpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcivetweb-cpp1-16-0 \
libcivetweb1-16-0"

inherit rpm
