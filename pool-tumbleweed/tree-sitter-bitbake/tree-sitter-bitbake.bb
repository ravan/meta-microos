SUMMARY = "BitBake grammar for tree-sitter"
DESCRIPTION = "BitBake grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tree-sitter-bitbake-1.1.0-2.4.aarch64.rpm"
RPM_HASH = "189179b82b2660e26d094b78fc656d35cf0120517b495b95a8b9b0636aec433052b21ab3138178a6b734e651644718aef471e1775a52d38d9c0820b8e01b0e77"

RPROVIDES:${PN} += "libtree-sitter-bitbake.so \
tree-sitter-bitbake \
treesitter-grammar-tree-sitter-bitbake"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
