SUMMARY = "Support and cli utilities based on liblockfile"
DESCRIPTION = "This package contains support binaries for the liblockfile library, \
and the command-line utility 'dotlockfile'."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.17"

RPM_NAME = "lockfile-1.17-1.12.aarch64.rpm"
RPM_HASH = "0a90df55bffb42475c8f1937d668b8e496aa14457db2cd3e85c337ed7dc45d49979fc822ee722e37d33ac147487e61bbb631db892d9028e12ee3e4c0ac2d4529"

RPROVIDES:${PN} += "lockfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
