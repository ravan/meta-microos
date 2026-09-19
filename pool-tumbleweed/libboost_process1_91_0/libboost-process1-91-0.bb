SUMMARY = "Boost.Process runtime library"
DESCRIPTION = "This package contains the Boost.Process runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_process1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "915c31b60b581bb0c0e5b3ca3393ad79bab9911532d6121ca619944deed53551faa399a76bfc731756d2c0b1aac5cfe6b5df19015b495413415ac873750c79fe"

RPROVIDES:${PN} += "libboost-process.so.1.91.0 \
libboost-process1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
