SUMMARY = "Tool for creating and verifying file hierarchies"
DESCRIPTION = "The mtree utility compares the file hierarchy rooted in the current \
directory against a specification read from the standard input. Messages \
are written to the standard output for any files whose characteristics do \
not match the specifications, or which are missing from either the file \
hierarchy or the specification. \
 \
Note: This is an older FreeBSD version of mtree; a newer NetBSD version \
is also available in the package 'nmtree'."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "mtree-1.0.4-4.18.aarch64.rpm"
RPM_HASH = "7d69a9ec5336ec78603e32148a2b01bb07121bee28c0b56a87b3bd5b86e6a411c2e50fd997616d6ce07936f95e0cbd1ecdd77c40e467f2cd740f7cb8dda88026"

RPROVIDES:${PN} += "mtree"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
