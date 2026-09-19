SUMMARY = "Qmldir grammar for tree-sitter"
DESCRIPTION = "Qmldir grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.2.2.12.6b2b5e4"

RPM_NAME = "tree-sitter-qmldir-0.2.2.12.6b2b5e4-3.5.aarch64.rpm"
RPM_HASH = "26ff3c1a7456e394b02a459d033cac64ebeb344858bba43703db9b70c9c2bd73e687bb742e60bbbcbc60f111c15f56242544e0f0b69d3f5329404e386293fe25"

RPROVIDES:${PN} += "libtree-sitter-qmldir.so \
tree-sitter-qmldir \
treesitter-grammar-tree-sitter-qmldir"

RDEPENDS:${PN} += ""

inherit rpm
