SUMMARY = "Asynchronous C implementation of the Raft consensus protocol"
DESCRIPTION = "This library is a asynchronous C implementation of the Raft consensus protocol. \
It implements the core Raft algorithm logic, and various drivers are provided \
that implement actual network communication and persistent data storage. \
 \
The library supports asynchronous or non-blocking I/O engines (such as libuv and \
io_uring), although it can be used in threaded or blocking contexts as well. \
 \
This package contains the shared library."
LICENSE = "LGPL-3.0-only-with-LGPL-3.0-linking-exception"

PV = "0.22.1"

RPM_NAME = "libraft0-0.22.1-1.9.aarch64.rpm"
RPM_HASH = "091da2c91e9b1d78119faf4c2a2bf5530a5a16c53f6b1f20c23acd11293d43e22fe0de02ca04a12e5b006bdf212df97a42ab3a0ff13d773b0e562390e9e7dcce"

RPROVIDES:${PN} += "libraft.so.0 \
libraft0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
libuv.so.1"

inherit rpm
