SUMMARY = "Runtime libraries for tolua++"
DESCRIPTION = "This package provides shared libraries for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_3-1-1.0.93-13.4.aarch64.rpm"
RPM_HASH = "29eb3f34cbad76f2e5c0f5e4da46fe09f99dee7864fb4d70b68890e1d9166cc1895e421b4c98d5a1deff87fd169cb14db3f8738ff0a8876816c5989eecfd8562"

RPROVIDES:${PN} += "libtolua++-5-3-1 \
libtolua++-5.3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.3.so.5 \
libm.so.6"

inherit rpm
