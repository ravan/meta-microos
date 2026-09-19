SUMMARY = "A sparse matrix library"
DESCRIPTION = "SPOOLES is a library for solving sparse real and complex linear systems \
of equations, written in the C language using object oriented design. \
 \
This:1"
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "libspooles2_2-openmpi-2.2-3.8.aarch64.rpm"
RPM_HASH = "7ce79c1bae4fd712c6c8bf61799792c560635d512522766c75e35c64170a9a213e9715b01d00831b5449748e0ff879fdbe029b678f5a69e826f40317a815ea92"

RPROVIDES:${PN} += "libspooles.so.2.2 \
libspooles2-2-openmpi"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.40 \
openmpi5-libs"

inherit rpm
