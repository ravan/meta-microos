SUMMARY = "Asychronous I/O support library"
DESCRIPTION = "Tree-sitter is a parser generator tool and an incremental parsing \
library. It can build a concrete syntax tree for a source file \
and efficiently update the syntax tree as the source file is \
edited. This is the package with the dynamically linked C library."
LICENSE = "GPL-2.0-only & MIT"

PV = "0.26.8"

RPM_NAME = "libtree-sitter0_26-0.26.8-5.2.aarch64.rpm"
RPM_HASH = "0bbf5788d0bba7eed2319edb8703651f55fb6a64c382584bc8d8a73937b07f83baa6bb385f1c5f9cb460884e8f62b484acfd433e9b2d0db7ca399373f5a03838"

RPROVIDES:${PN} += "libtree-sitter.so.0.26 \
libtree-sitter0-26"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
