SUMMARY = "File-based build system"
DESCRIPTION = "Tup is a file-based build system. \
It inputs a list of file changes and a directed acyclic graph (DAG), \
then processes the DAG to execute the appropriate commands required \
to update dependent files."
LICENSE = "GPL-2.0-only"

PV = "0.8"

RPM_NAME = "tup-0.8-1.13.aarch64.rpm"
RPM_HASH = "7535d6e781c4ab93ce2f75447a56d1695269cf1abe55d4950ede3d3f66d5b1863295acb493e1303cce65f206435235261097461168fb162274e23ce56c4b0658"

RPROVIDES:${PN} += "tup"

RDEPENDS:${PN} += "libc.so.6 \
libfuse3.so.4 \
libm.so.6 \
libpcre2-8.so.0 \
vim"

inherit rpm
