SUMMARY = "Json grammar for tree-sitter"
DESCRIPTION = "Python binding for the tree-sitter-json grammar."
LICENSE = "MIT"

PV = "0.24.8"

RPM_NAME = "tree-sitter-json-0.24.8-3.1.aarch64.rpm"
RPM_HASH = "35da2c75178e3fec15aa407c98cc179ad1028374cbe9fdadaf4d843dd0a87cb54f1067cdec8da993dc2bb1d915211e9a8304ef71125c99cfe61fe8b176f55fb6"

RPROVIDES:${PN} += "libtree-sitter-json.so \
tree-sitter-json \
treesitter-grammar-tree-sitter-json"

RDEPENDS:${PN} += ""

inherit rpm
