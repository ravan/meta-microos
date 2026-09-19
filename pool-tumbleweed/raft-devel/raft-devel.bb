SUMMARY = "Development files for raft"
DESCRIPTION = "This library is a asynchronous C implementation of the Raft consensus protocol. \
It implements the core Raft algorithm logic, and various drivers are provided \
that implement actual network communication and persistent data storage. \
 \
The library supports asynchronous or non-blocking I/O engines (such as libuv and \
io_uring), although it can be used in threaded or blocking contexts as well. \
This library is a fully asynchronous C implementation of the Raft consensus protocol. \
 \
This package contains the files necessary for developing and building applications \
using the library."
LICENSE = "LGPL-3.0-only-with-LGPL-3.0-linking-exception"

PV = "0.22.1"

RPM_NAME = "raft-devel-0.22.1-1.9.aarch64.rpm"
RPM_HASH = "df0d7074cb1adecdb5767eb855506eb60919be6b92b068c0ce5de4a6f19755cb6f18a2a6e03f145f67bbfa182c368cd8fa4e0c921473ecb1485ff86db0809025"

RPROVIDES:${PN} += "pkgconfig-raft \
raft-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libraft0"

inherit rpm
