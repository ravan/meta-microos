SUMMARY = "Primitives to interface with pseudo terminal devices"
DESCRIPTION = "This library provides primitives to interface with pseudo terminal devices \
as well as a KProcess derived class for running child processes and \
communicating with them using a pty."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kpty-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "bf3d6a958f0c525d2ff7ae308177e60a9b58fcb212a842bc48cd3c1938fd59a2b948ffc14f4aaeacb04ea72a8c3d87c5be25a60e57e55a8e6826f1ba5c11d53d"

RPROVIDES:${PN} += "kf6-kpty"

RDEPENDS:${PN} += ""

inherit rpm
