SUMMARY = "Javascript grammar for tree-sitter"
DESCRIPTION = "Python binding for the tree-sitter-javascript grammar."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "tree-sitter-javascript-0.23.1-4.1.aarch64.rpm"
RPM_HASH = "551aa80bb538f56e686b64cf9a87fa285651d09a0fa52925589f7059d35b3f5571ea4dc4b24ac2e2132eaed111148a030ced126fc6f65c65c17584337fb2fd5e"

RPROVIDES:${PN} += "libtree-sitter-javascript.so \
tree-sitter-javascript \
treesitter-grammar-tree-sitter-javascript"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
