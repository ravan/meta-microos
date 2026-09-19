SUMMARY = "Boost.Thread runtime libraries"
DESCRIPTION = "This package contains the Boost.Thread runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_thread1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "44bb0d2ecec919feeb3e7a3a5be8a640351a6efcb4e0e39c0964266d90da29520eaffae0c6319c245ed89a54a7eaea42bd6d65f2e23a620e8fe4b711c35dbd4a"

RPROVIDES:${PN} += "libboost-thread.so.1.91.0 \
libboost-thread1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
