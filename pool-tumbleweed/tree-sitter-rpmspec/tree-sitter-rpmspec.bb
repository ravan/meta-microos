SUMMARY = "RPMspec grammar for tree-sitter"
DESCRIPTION = "RPMspec grammar for tree-sitter."
LICENSE = "MIT"

PV = "0+20260218.12ca618"

RPM_NAME = "tree-sitter-rpmspec-0+20260218.12ca618-3.3.aarch64.rpm"
RPM_HASH = "388b6a02593090151d14b9277a3bc159c1e8bb4c6c64c2988584731e531b12459f3345605d533180958de058fdeaeab576875517d847e4087d285730c01d117b"

RPROVIDES:${PN} += "libtree-sitter-rpmbash.so \
libtree-sitter-rpmspec.so \
tree-sitter-rpmspec \
treesitter-grammar-tree-sitter-rpmbash \
treesitter-grammar-tree-sitter-rpmspec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
