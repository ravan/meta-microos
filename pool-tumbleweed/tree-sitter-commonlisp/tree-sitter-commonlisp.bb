SUMMARY = "Common Lisp grammar for tree-sitter"
DESCRIPTION = "Common Lisp grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "tree-sitter-commonlisp-0.4.1-2.4.aarch64.rpm"
RPM_HASH = "b8eaabd77bb760c185ea97113e01c7b612d1ac9fae7d5989579c9d358a5d6d6444475e438d5480d0c57ed4f466db1d4ec2882e9417cde4a1baddfee684a45935"

RPROVIDES:${PN} += "libtree-sitter-commonlisp.so \
tree-sitter-commonlisp \
treesitter-grammar-tree-sitter-commonlisp"

RDEPENDS:${PN} += ""

inherit rpm
