SUMMARY = "Utility for mapping directory hierarchies"
DESCRIPTION = "The mtree utility compares the file hierarchy rooted in the current \
directory against a specification read from the standard input. Messages \
are written to the standard output for any files whose characteristics do \
not match the specification, or which are missing from either the file \
hierarchy or the specification. \
 \
This is a port of the NetBSD version of mtree."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "nmtree-1.0.0-2.18.aarch64.rpm"
RPM_HASH = "6cc504c1272c01639effe5a0d895cafa09e2c14886d5228bc5769e510729ea5e39d95704893f8715fa9d27c2575c385238ec49953f3cf8f5e77e31e6f23208b9"

RPROVIDES:${PN} += "nmtree"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnbcompat.so.0"

inherit rpm
