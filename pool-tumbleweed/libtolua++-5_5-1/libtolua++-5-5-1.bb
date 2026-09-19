SUMMARY = "Runtime libraries for tolua++"
DESCRIPTION = "This package provides shared libraries for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_5-1-1.0.93-13.4.aarch64.rpm"
RPM_HASH = "f090167201fa3d0b3b6c99658d4b2eb1b532641665664e9ec5c878b00a1ce154783b11e42d832dc4323b403c9ca5f600de641c652062619fa677b82354b98815"

RPROVIDES:${PN} += "libtolua++-5-5-1 \
libtolua++-5.5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.5.so.5 \
libm.so.6"

inherit rpm
