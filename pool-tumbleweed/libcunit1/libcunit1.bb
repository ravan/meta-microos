SUMMARY = "CUnit shared library"
DESCRIPTION = "CUnit is a unit testing framework for C. \
This package installs the CUnit shared library."
LICENSE = "LGPL-2.0-only"

PV = "2.1.3"

RPM_NAME = "libcunit1-2.1.3-7.10.aarch64.rpm"
RPM_HASH = "75fe55bf5bcbb41e19e37c925e7657a443b883a8eccba13aab3f5625402201a42db42dd7d479304e6434fba19d50050b553be04985afb64d008ad92d321ce08d"

RPROVIDES:${PN} += "libcunit.so.1 \
libcunit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
