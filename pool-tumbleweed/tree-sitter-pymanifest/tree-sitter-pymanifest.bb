SUMMARY = "PyPA manifest grammar for tree-sitter"
DESCRIPTION = "PyPA manifest grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "tree-sitter-pymanifest-0.5.1-2.4.aarch64.rpm"
RPM_HASH = "6f041d50cb9f594733f43c7b843623f10e5a0f51b3a0ef1e36bef711a31005ebefdcdd9e3f4ff239f4d9b27bfc58c8db2944e8fd43ac8995c6f953396fadfb29"

RPROVIDES:${PN} += "libtree-sitter-pymanifest.so \
tree-sitter-pymanifest \
treesitter-grammar-tree-sitter-pymanifest"

RDEPENDS:${PN} += ""

inherit rpm
