SUMMARY = "Source Code Control System"
DESCRIPTION = "Source Code Control System (SCCS) is a version control system for \
tracking changes in source code and other text files during the \
development of a piece of software. This allows the user to retrieve \
any of the previous versions of the original source code and the \
changes which are stored."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "sccs-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "8236558b9227c5d5a6cc4f2d7f0c2615e3de126c0d4c060d38dfa9f91aff9523b0e95cc06e8ebb636265f5c82060ea29986aaaeda5315e5a4f2a9f6a18ea23f8"

RPROVIDES:${PN} += "sccs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
