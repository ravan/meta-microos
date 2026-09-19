SUMMARY = "Boost.Log runtime Run-Time library"
DESCRIPTION = "This package contains runtime library for Boost.Log."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_log1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "4150e82224f5438a2dcf87eb94ffbcdb6eb44c16ada5ff82a42e71c5638fba60d148ea4153333b93ee16e93a0e969adc4902e007dfee98e05afd92cf310179c5"

RPROVIDES:${PN} += "libboost-log-setup.so.1.91.0 \
libboost-log.so.1.91.0 \
libboost-log1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
