SUMMARY = "LLVM TableGen grammar for tree-sitter"
DESCRIPTION = "LLVM TableGen grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.0.1"

RPM_NAME = "tree-sitter-tablegen-0.0.1-2.4.aarch64.rpm"
RPM_HASH = "21b2fdc338ba7cdbb89836515449ee82ebfdb5d88fc0d64c29e2458491b04c1c62ef3adab25c3076dbb8ff7b236811bf6c33f8ee4d89bddcd288112ad7ab3853"

RPROVIDES:${PN} += "libtree-sitter-tablegen.so \
tree-sitter-tablegen \
treesitter-grammar-tree-sitter-tablegen"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
