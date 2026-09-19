SUMMARY = "Development headers for Boost.Thread library"
DESCRIPTION = "This package contains development headers for Boost.Thread library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_thread1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "ace1eec53cfa536cdb1268c9a8617ef8284ae1af9011ed16ed5e9db930960d36225940df77a2243ff47152b4796664453735ffd6b976425c3d2d6e3e3637eb43"

RPROVIDES:${PN} += "libboost-thread-devel-impl \
libboost-thread1-91-0-devel"

RDEPENDS:${PN} += "libboost-atomic1-91-0-devel \
libboost-chrono1-91-0-devel \
libboost-container1-91-0-devel \
libboost-date-time1-91-0-devel \
libboost-headers1-91-0-devel \
libboost-thread1-91-0"

inherit rpm
