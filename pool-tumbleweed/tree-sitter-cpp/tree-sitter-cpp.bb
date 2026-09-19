SUMMARY = "C++ grammar for tree-sitter"
DESCRIPTION = "Python binding for the tree-sitter-cpp grammar."
LICENSE = "MIT"

PV = "0.23.4"

RPM_NAME = "tree-sitter-cpp-0.23.4-3.1.aarch64.rpm"
RPM_HASH = "d618fb2e6af4e75069a7c49151b97d94b36b35ae36e4f72e9aaf44797e41703b9dc678c941996d7cc9ed63ae35ea2b8872e7e3d1721ddb3a1c418cb61681d702"

RPROVIDES:${PN} += "libtree-sitter-cpp.so \
tree-sitter-cpp \
treesitter-grammar-tree-sitter-cpp"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
