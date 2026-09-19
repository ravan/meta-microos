SUMMARY = "Hare grammar for tree-sitter"
DESCRIPTION = "Hare grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-hare-1.0.0-2.4.aarch64.rpm"
RPM_HASH = "f4fd107c065d387fd224a464c0cc6219e864abb0ad746cee9ccd28e95387a02a870419cbfbd17bb398cb6afbeb90cdfb5b2674ed21b8f2692685aa278576d62a"

RPROVIDES:${PN} += "libtree-sitter-hare.so \
tree-sitter-hare \
treesitter-grammar-tree-sitter-hare"

RDEPENDS:${PN} += ""

inherit rpm
