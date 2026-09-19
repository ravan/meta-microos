SUMMARY = "A tree-sitter grammar for go.mod files"
DESCRIPTION = "A tree-sitter grammar for go.mod files."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tree-sitter-gomod-1.1.0-3.5.aarch64.rpm"
RPM_HASH = "c25771c6f7852259843fc6da454b1cf417faceceba31ca79597e45120de5f37aeb68fb9ecde10b8b1914aaeb34e4d2609933397289e76295a034ab110e452586"

RPROVIDES:${PN} += "libtree-sitter-gomod.so \
tree-sitter-gomod \
treesitter-grammar-tree-sitter-gomod"

RDEPENDS:${PN} += ""

inherit rpm
