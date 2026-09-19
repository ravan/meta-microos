SUMMARY = "Development files for mcpp"
DESCRIPTION = "mcpp is a small and portable C/C++ preprocessor implementing all of \
C90, C99 and C++98. \
 \
This package holds the development files for libev."
LICENSE = "BSD-3-Clause"

PV = "2.7.2.2"

RPM_NAME = "mcpp-devel-2.7.2.2-1.4.aarch64.rpm"
RPM_HASH = "84fc1b935938fbd1ea29e6948c16305ac2bca0d8ef1e7ad15a7cd841f405f7b9ca8d17a778fae2267a9f8083b5ddbe0051bf0785babb76d896b80cca814e3ff5"

RPROVIDES:${PN} += "mcpp-devel"

RDEPENDS:${PN} += "libmcpp0 \
mcpp"

inherit rpm
