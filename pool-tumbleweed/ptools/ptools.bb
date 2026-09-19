SUMMARY = "The process tools collection"
DESCRIPTION = "pbuildid dumps the build-ids of an executable, core file or a process, \
given the pid of that process."
LICENSE = "GPL-2.0-or-later"

PV = "0.1"

RPM_NAME = "ptools-0.1-29.10.aarch64.rpm"
RPM_HASH = "cd807761c99be6fc187d092da456cba2a69f14df5fc3ef9b3d71d923b751a549a6920993f697ec4b007fa9c3c8b9af369b68c80be235c4fef16889a0e3563153"

RPROVIDES:${PN} += "ptools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libpopt.so.0"

inherit rpm
