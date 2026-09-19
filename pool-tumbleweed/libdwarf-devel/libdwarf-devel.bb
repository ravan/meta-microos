SUMMARY = "Development files for libdwarf"
DESCRIPTION = "Contains the static libraries and header files of libdwarf. \
 \
libdwarf is a library of functions to provide read/write DWARF \
debugging records."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "libdwarf-devel-2.3.2-1.2.aarch64.rpm"
RPM_HASH = "2c87d30ce1ada605d0f957960dd4233cc71c9e72d383fe6323ff3aaefc3f2fda7174c579bf977de0c9d73e7f596558a40828aeb217f051b896a0bde72ad8fb98"

RPROVIDES:${PN} += "libdwarf-devel \
pkgconfig-libdwarf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdwarf2 \
libelf-devel \
pkgconfig-libzstd"

inherit rpm
