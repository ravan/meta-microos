SUMMARY = "A sparse matrix library"
DESCRIPTION = "SPOOLES is a library for solving sparse real and complex linear systems \
of equations, written in the C language using object oriented design. \
 \
This:0"
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "libspooles2_2-2.2-3.8.aarch64.rpm"
RPM_HASH = "418df60d711bddc0a4b40fce60e2baf0b58e9a2892387a1f91da02494c3ac18ccffec9a9829852c0dc570dfd6fd315cc8e0e0a7455ed228bce1addb090655f4b"

RPROVIDES:${PN} += "libspooles.so.2.2 \
libspooles2-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
