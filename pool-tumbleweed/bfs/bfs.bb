SUMMARY = "A breadth-first version of the UNIX find command"
DESCRIPTION = "bfs is a variant of the UNIX find command that operates breadth-first rather than depth-first. It is otherwise compatible with many versions of find."
LICENSE = "0BSD"

PV = "4.1.3"

RPM_NAME = "bfs-4.1.3-1.1.aarch64.rpm"
RPM_HASH = "7bf93fefe14beb8f76dc0e25800a785fdd4eb7c8e9e300f8f132616beb38dae7c7bac0ff8f7f84647386b34c8d3eed254c8cd1f8722283ed8032e5b75ea53db8"

RPROVIDES:${PN} += "bfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcap.so.2 \
libonig.so.5 \
libselinux.so.1 \
liburing.so.2"

inherit rpm
