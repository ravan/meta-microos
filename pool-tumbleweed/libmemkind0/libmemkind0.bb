SUMMARY = "User Extensible Heap Manager shared library"
DESCRIPTION = "The memkind library is an user extensible heap manager built on top \
of jemalloc which enables control of memory characteristics and a \
partitioning of the heap between kinds of memory. The kinds of memory \
are defined by operating system memory policies that have been \
applied to virtual address ranges. Memory characteristics supported \
by memkind without user extension include control of NUMA and page \
size features. The jemalloc non-standard interface has been extended \
to enable specialized arenas to make requests for virtual memory from \
the operating system through the memkind partition interface. Through \
the other memkind interfaces, the user can control and extend memory \
partition features and allocate memory while selecting enabled \
features."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "libmemkind0-1.14.0-3.1.aarch64.rpm"
RPM_HASH = "c4100053911587cc49c18c232dcae447dfbaba03161a2652a3f8f138e8ad714630af44af3a5880d780cd987cd24e3f0c6c74b48ac6782568bcf176a50fe9565f"

RPROVIDES:${PN} += "libmemkind.so.0 \
libmemkind0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnuma.so.1"

inherit rpm
