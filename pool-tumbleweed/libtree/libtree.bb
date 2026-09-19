SUMMARY = "Ldd as a tree"
DESCRIPTION = "Libtree is tool that turns ldd into a tree, and explains how shared libraries \
are found or why they cannot be located."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "libtree-3.1.1-2.9.aarch64.rpm"
RPM_HASH = "511cfeba3b32e239bc739d71975f5ee30ad633c1b1eb9d64b65705fb57eb7bca8e91897bf77637d5537dcc1d8beae32f0852e06257c254f3c24896b5b9587da5"

RPROVIDES:${PN} += "libtree"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
