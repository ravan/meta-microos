SUMMARY = "Go grammar for tree-sitter"
DESCRIPTION = "Python binding for the tree-sitter-go grammar."
LICENSE = "MIT"

PV = "0.23.4"

RPM_NAME = "tree-sitter-go-0.23.4-3.1.aarch64.rpm"
RPM_HASH = "3cbb0808768386248697e3fe6ce472c0996a872a05030344d9901006459620807623c3585aadffa5ac7b81ead2904345ac8ef8fd6eaf23c3ce8c40bc93c12310"

RPROVIDES:${PN} += "libtree-sitter-go.so \
tree-sitter-go \
treesitter-grammar-tree-sitter-go"

RDEPENDS:${PN} += ""

inherit rpm
