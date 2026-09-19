SUMMARY = "Kconfig grammar for tree-sitter"
DESCRIPTION = "Kconfig grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "tree-sitter-kconfig-1.3.0-2.4.aarch64.rpm"
RPM_HASH = "2566d60edbf8353d854cf0b8ae43d78dd75f6cf8191a6e9502f8dba0b296b2861b56930f425511730f8c3563ca2e45f9ad4c7e629a69d572522f392b4f45ab9e"

RPROVIDES:${PN} += "libtree-sitter-kconfig.so \
tree-sitter-kconfig \
treesitter-grammar-tree-sitter-kconfig"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
