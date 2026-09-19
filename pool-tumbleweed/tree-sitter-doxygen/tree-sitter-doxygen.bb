SUMMARY = "Doxygen grammar for tree-sitter"
DESCRIPTION = "Doxygen grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tree-sitter-doxygen-1.1.0-2.4.aarch64.rpm"
RPM_HASH = "ed20bd873a0d546ac29d364de58088a006b0df178e2265604f89360616301420d48a09f520e95eba3180d46eeb7c32f04fa6b69f206e37d512285973ff614f16"

RPROVIDES:${PN} += "libtree-sitter-doxygen.so \
tree-sitter-doxygen \
treesitter-grammar-tree-sitter-doxygen"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
