SUMMARY = "Programs for vertex generation using Double Description Method"
DESCRIPTION = "cddlib is a C implementation of the Double Description Method of \
Motzkin et al. for generating all vertices (i.e. extreme points) and \
extreme rays of a general convex polyhedron in R^d given by a system \
of linear inequalities. \
 \
This package contains the command-line utilities of cddlib."
LICENSE = "GPL-2.0-or-later"

PV = "0.94n"

RPM_NAME = "cddlib-tools-0.94n-1.5.aarch64.rpm"
RPM_HASH = "db9053611b46f2ee6a1b87ae1df16ba2b1c33c655c3180cfdcb025c01de24d530ed72d42e891ad373c04c43fe16b7cfdb8cfd704df5fa2199e53c98c74faa750"

RPROVIDES:${PN} += "cddlib-devel-/usr/bin/scdd \
cddlib-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdd.so.0 \
libcddgmp.so.0 \
libgmp.so.10"

inherit rpm
