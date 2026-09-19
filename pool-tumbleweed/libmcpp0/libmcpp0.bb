SUMMARY = "The shared library of Matsui's C Preprocessor"
DESCRIPTION = "mcpp is a small and portable C/C++ preprocessor implementing all of \
C90, C99 and C++98. \
 \
This package holds the shared libraries of libev."
LICENSE = "BSD-3-Clause"

PV = "2.7.2.2"

RPM_NAME = "libmcpp0-2.7.2.2-1.4.aarch64.rpm"
RPM_HASH = "ce29736271861f87c614ee8ad3921ef138e12e684657e68934dd1163dd724690ad0ab277cbc342266cdc30bb4bedd2c195230d6e031b14d6e14835465b33909d"

RPROVIDES:${PN} += "libmcpp.so.0 \
libmcpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
