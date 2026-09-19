SUMMARY = "A cross-platform C++ library for network and low-level I/O programming"
DESCRIPTION = "Asio is a cross-platform C++ library for network and low-level I/O \
programming that provides developers with a consistent asynchronous I/O \
model using a modern C++ approach."
LICENSE = "BSD-3-Clause"

PV = "1.30.2"

RPM_NAME = "asio-devel-1.30.2-1.7.aarch64.rpm"
RPM_HASH = "1199ecdf5863f3b1b990f4ef31d7cee341c453c942b2d09211e16d048f4e75aacdaca75180531b8ef0cb303ce8ba8af876eaf692a9aefbd1023d242cdde5e9d0"

RPROVIDES:${PN} += "asio-devel \
pkgconfig-asio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
boost-devel \
openssl-devel"

inherit rpm
