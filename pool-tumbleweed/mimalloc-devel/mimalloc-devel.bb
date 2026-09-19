SUMMARY = "Development files for mimalloc"
DESCRIPTION = "This is a general purpose allocator. \
It is a drop-in replacement for malloc and can be used in other \
programs without code changes. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of mimalloc."
LICENSE = "MIT"

PV = "3.3.2"

RPM_NAME = "mimalloc-devel-3.3.2-1.3.aarch64.rpm"
RPM_HASH = "fd7a796c62f51ab67bcb89767f04765625287794327099445fa983d7ed33001716e4b2d5c6839a81ceebd654fb0cdb793b56f60ee3cfcbd96648cae7e452bc38"

RPROVIDES:${PN} += "cmake-mimalloc \
mimalloc-devel \
pkgconfig-mimalloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmimalloc3"

inherit rpm
