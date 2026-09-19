SUMMARY = "Cap'n Proto grammar for tree-sitter"
DESCRIPTION = "Cap'n Proto grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "tree-sitter-capnp-1.5.0-2.4.aarch64.rpm"
RPM_HASH = "1b56e7686e71d3a20e4c24b7d73cb6423149bf7ebdc71fc6136767ec77403a492fecc4bec9dbe2dfd31736ab7449a26eb9e4e6ecc58709768f37204e66fb6225"

RPROVIDES:${PN} += "libtree-sitter-capnp.so \
tree-sitter-capnp \
treesitter-grammar-tree-sitter-capnp"

RDEPENDS:${PN} += ""

inherit rpm
