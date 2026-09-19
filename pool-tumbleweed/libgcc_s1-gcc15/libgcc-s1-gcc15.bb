SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "15.3.0+git11272"

RPM_NAME = "libgcc_s1-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "6a7e6bc4024f7ccb7b3d3acd995e1a5938e69ad08c3a6cd638439f2a0272142b9fd4116d331dfe390da9f58db7a768a6ea8c12465730bc8dc786f7cf0ec59e31"

RPROVIDES:${PN} += "libgcc-s.so.1 \
libgcc-s1 \
libgcc-s1-gcc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
