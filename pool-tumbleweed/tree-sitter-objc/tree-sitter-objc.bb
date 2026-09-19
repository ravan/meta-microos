SUMMARY = "Objective-C grammar for tree-sitter"
DESCRIPTION = "Python binding for the objc tree-sitter grammar."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "tree-sitter-objc-3.0.2-1.1.aarch64.rpm"
RPM_HASH = "588db9128dcd45ab4f54f0403d8735036b7d31a38f05571b350b49a4015d2e4e2743b88a5776f121816205e9eb00f9557c792f2f585a8a0121f511f27ab92c93"

RPROVIDES:${PN} += "libtree-sitter-objc.so \
tree-sitter-objc \
treesitter-grammar-tree-sitter-objc"

RDEPENDS:${PN} += ""

inherit rpm
