SUMMARY = "User Extensible Heap Manager"
DESCRIPTION = "The memkind library is an user extensible heap manager built on top \
of jemalloc which enables control of memory characteristics and a \
partitioning of the heap between kinds of memory. \
 \
 \
 \
 \
 \
%global __debug_package 1"
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "memkind-1.14.0-3.1.aarch64.rpm"
RPM_HASH = "1949072a29909ef5781bd17f4a6cd86a9b53dde144d6a05ef0b67b9b4a352cc904435ceb723ce0c8075ba8c4e1c93270135a8c50cec3c1e98eb3d50788397183"

RPROVIDES:${PN} += "memkind"

RDEPENDS:${PN} += "libc.so.6 \
libmemkind.so.0 \
libnuma.so.1"

inherit rpm
