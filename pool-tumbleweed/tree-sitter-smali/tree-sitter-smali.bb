SUMMARY = "Smali grammar for tree-sitter"
DESCRIPTION = "Smali grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-smali-1.0.0-2.4.aarch64.rpm"
RPM_HASH = "85e1d0fa0ce3a707386a24ca6fc2154bb82c151f239e5eef19606cd92009b8f0f817a9f697ce96d7d6c40fb43f48fb8f15c0019be5243703f7baba4574b57001"

RPROVIDES:${PN} += "libtree-sitter-smali.so \
tree-sitter-smali \
treesitter-grammar-tree-sitter-smali"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
